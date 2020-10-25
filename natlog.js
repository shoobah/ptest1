var eNew = 1;
var eOld = 0;
var factorial = 1;
var n = 1;
do {
  factorial *= n++;
  eOld = eNew;
  eNew = eOld + 1 / factorial;
  console.log(eNew);
} while (Math.abs(eNew - eOld) > 1e-5);
