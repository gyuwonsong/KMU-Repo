import unittest

from guess import Guess

class TestGuess(unittest.TestCase):

    def setUp(self):
        self.g1 = Guess('default')
        self.g2 = Guess('apple')

    def tearDown(self):
        pass

    def testDisplayCurrent(self):
        self.g1.guess('e')       #존재 단어 입력시, 현재 상태 확인
        self.assertEqual(self.g1.displayCurrent(), '_ e _ _ _ _ _ ')
        self.g1.guess('w')       #존재하지 않는 단어 입력시, 현재 상태 확인
        self.assertEqual(self.g1.displayCurrent(), '_ e _ _ _ _ _ ')
        self.g1.guess('a')
        self.assertEqual(self.g1.displayCurrent(), '_ e _ a _ _ _ ')
        self.g1.guess('t')
        self.assertEqual(self.g1.displayCurrent(), '_ e _ a _ _ t ')
        self.g1.guess('u')
        self.assertEqual(self.g1.displayCurrent(), '_ e _ a u _ t ')
        self.g1.guess('d')
        self.assertEqual(self.g1.displayCurrent(), 'd e _ a u _ t ')
        self.g1.guess('f')
        self.assertEqual(self.g1.displayCurrent(), 'd e f a u _ t ')
        self.g1.guess('l')
        self.assertEqual(self.g1.displayCurrent(), 'd e f a u l t ')

    def testDisplayGuessed(self):
        self.g1.guess('e')
        self.assertEqual(self.g1.displayGuessed(), ' e ')
        self.g1.guess('n')
        self.assertEqual(self.g1.displayGuessed(), ' e n ')
        self.g1.guess('a')
        self.assertEqual(self.g1.displayGuessed(), ' a e n ')
        self.g1.guess('t')
        self.assertEqual(self.g1.displayGuessed(), ' a e n t ')
        self.g1.guess('u')
        self.assertEqual(self.g1.displayGuessed(), ' a e n t u ')

    def testguess(self):
        self.assertFalse(self.g2.guess('q'))  #없는 단어 입력시 리턴값 확인
        self.assertEqual(self.g2.currentStatus, '_____')
        self.assertEqual(self.g2.guessedChars, {'', 'q'})

        self.assertTrue(self.g2.guess('a'))  #있는 단어 입력시 리턴값 확인
        self.assertEqual(self.g2.currentStatus, 'a____')  #부분적으로 맞추어진 단어의 상태 확인
        self.assertEqual(self.g2.guessedChars, {'', 'q', 'a'})    #이용된 글자들의 집합이 올바르게 유지되는지 확인

        self.assertFalse(self.g2.guess('i'))
        self.assertEqual(self.g2.currentStatus, 'a____')
        self.assertEqual(self.g2.guessedChars, {'', 'q', 'a', 'i'})

        self.assertTrue(self.g2.guess('p'))   #두개의 단어 포함시 확인
        self.assertEqual(self.g2.currentStatus, 'app__')
        self.assertEqual(self.g2.guessedChars, {'', 'q', 'a', 'i', 'p'})

        self.assertTrue(self.g2.guess('l'))
        self.assertEqual(self.g2.currentStatus, 'appl_')
        self.assertEqual(self.g2.guessedChars, {'', 'q', 'a', 'i', 'p', 'l'})
        self.assertFalse(self.g2.finished())  #단어의 전체를 다 맞추지 못한 경우 리턴값 확인

        self.assertTrue(self.g2.guess('e'))
        self.assertEqual(self.g2.currentStatus, 'apple')
        self.assertEqual(self.g2.guessedChars, {'', 'q', 'a', 'i', 'p', 'l', 'e'})
        self.assertTrue(self.g2.finished())  #단어의 전체를 다 맞춘 경우 리턴값 확인


if __name__ == '__main__':
    unittest.main()