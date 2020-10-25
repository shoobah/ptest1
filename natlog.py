eNew = 1.0
eOld = 0.0
factorial = 1
n = 1
while(abs(eNew - eOld) > 1e-5):
    factorial *= n
    n += 1
    eOld = eNew
    eNew = eOld + 1.0 / factorial
    print(eNew)
