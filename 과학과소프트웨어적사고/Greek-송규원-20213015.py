greek={'Alpha' :"알파", 'Beta':"베타",'Gamma':"감마",'Delta':"델타",'Epsilon':"앱실론",'Zeta':"제타",'Eta':"에타",'Theta':"세타",'lota':"요타",'Kappa':"카파",'Lambda':"람다",'Mu':"뮤",'Nu':"뉴",'Xi':"크사이",'Omicron':"오미크론",'Pi':"파이",'Rho':"로",'Sigma':"시그마",'Tau':"타우",'Upsilon':"입실론",'Phi':"피",'Chi':"카이",'Psi':"프사이",'Omega':"오메가"}
print(">> 그리스 문자:", greek)

a=input("\n>> key 입력:")

if a in greek:
    print(">> key:", a ,", value:", greek[a])

else:
    print(">> 입력한 key가 존재하지 않음.")
