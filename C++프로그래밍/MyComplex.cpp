#include "MyComplex.h"

// Constructor
myComplex::myComplex(int real, int imag){
    realPart = real;
    imaginaryPart = imag;
}
// Copy constructor
myComplex::myComplex(const myComplex& number){
    realPart = number.realPart;
    imaginaryPart = number.imaginaryPart;
}

// Accessor functions
int myComplex::getRealPart() const{
    return realPart;
}
int myComplex::getImaginaryPart() const{
    return imaginaryPart;
}
// Mutator functions
void myComplex::setRealPart(int real){
    realPart = real;
}
void myComplex::setImaginaryPart(int imag){
    imaginaryPart = imag;
}
void myComplex::set(int real, int imag){
    realPart = real;
    imaginaryPart = imag;
}

// Binary operators
myComplex myComplex::operator +(const myComplex& number) const{
    int newReal = realPart + number.realPart;
    int newImag = imaginaryPart + number.imaginaryPart;
    return myComplex(newReal, newImag);
    
}
myComplex myComplex::operator +(int value) const{
    return myComplex(value) + (*this);
}
myComplex myComplex::operator +(int value, const myComplex& number){
    return number + value; 
}
myComplex myComplex::operator -(const myComplex& number) const{
    int newReal = realPart - number.realPart;
    int newImag = imaginaryPart - number.imaginaryPart;
    return myComplex (newReal, newImag);
}
myComplex myComplex::operator -(int value) const{
    return (*this) - myComplex(value);
}
myComplex myComplex::operator -(int value, const myComplex& number){
    return (-number) + value; 
}
myComplex myComplex::operator *(const myComplex& number) const{
    int newReal = (realPart * number.realPart) - (imaginaryPart * number.imaginaryPart);
    int newImag = (realPart * number.imaginaryPart) + (imaginaryPart * number.realPart);
    return myComplex (newReal, newImag);
}
myComplex myComplex::operator *(int value) const{
    return myComplex(value) * (*this);
}
myComplex myComplex::operator *(int value, const myComplex& number){
    return number * value
}

// Assignment operators
myComplex& myComplex::operator =(const myComplex& number){
    this->realPart = number.realPart;
    this->imaginaryPart = number.imaginaryPart;
    return *this;
}
myComplex& myComplex::operator =(int value){
    realPart = value;
    imaginaryPart = 0;
    return *this;
}
myComplex& myComplex::operator +=(const myComplex& number){
    this->realPart += number.realPart;
    this->imaginaryPart += number.imaginaryPart;
    return *this;
}
myComplex& myComplex::operator +=(int value){
    realPart += value;
    return *this;
}
myComplex& myComplex::operator -=(const myComplex& number){
    this->realPart -= number.realPart;
    this->imaginaryPart -= number.imaginaryPart;
    return *this;
}
myComplex& myComplex::operator -=(int value){
    realPart -= value;
    imaginaryPart = -imaginaryPart;
    return *this;
}
myComplex& myComplex::operator *=(const myComplex& number){
    this->realPart *= realPart;
    this->imaginaryPart *= number.imaginaryPart;
    return *this;
}
myComplex& myComplex::operator *=(int value){
    realPart *= value;
    imaginaryPart *= value;
    return *this;
}

// Relational operator
bool myComplex::operator ==(const myComplex& number) const{
    return (realPart == number.realPart) && (imaginaryPart == number.imaginaryPart);
}
bool myComplex::operator !=(const myComplex& number) const{
    return !((realPart == number.realPart) && (imaginaryPart == number.imaginaryPart));
}
bool myComplex::operator <(const myComplex& number) const{
    return norm() < number.norm();
}
bool myComplex::operator >(const myComplex& number) const{
    return number.norm() < norm();
}
bool myComplex::operator <=(const myComplex& number) const{
    return !(norm() > number.norm());
}
bool myComplex::operator >=(const myComplex& number) const{
    return !(norm() < number.norm());
}

// Unary operators
myComplex myComplex::operator -(){
    return myComplex(-realPart, -imaginaryPart);
}
myComplex myComplex::operator ~(){ // unary minus
    return myComplex(realPart, -imaginaryPart);
}
myComplex& myComplex::operator ++(){
    realPart++;
    myComplex pos(getRealPart(), getImaginaryPart());
    return pos;
}
myComplex myComplex::operator ++(int){
    myComplex pos(getRealPart(), getImaginaryPart());
    realPart++;
    return pos;

}
myComplex& myComplex::operator --(){
    realPart--;
    myComplex pos(getRealPart(), getImaginaryPart());
    return pos;
}
myComplex myComplex::operator --(int){
    myComplex pos(getRealPart(), getImaginaryPart());
    realPart--;
    return pos;
}

// << and >> operator
ostream &operator <<(ostream &outStream, const myComplex& number){
    outStream << "(" << number.realPart << "," << number.imaginaryPart << ")";
    return outStream;
}
istream &operator >>(istream &inStream, myComplex& number){
    inStream >> number.realPart >> number.imaginaryPart;
    return inStream;
}

// private function
int myComplex::norm() const{
    return realPart * realPart + imaginaryPart * imaginaryPart;
}