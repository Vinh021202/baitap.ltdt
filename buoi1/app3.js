//Coding Challenge #4

const bill = {
    a: 275,
    b: 40,
    c: 430

}
const tip = bill.a >= 50 && bill.a <= 300 ? bill.a * 0.15 : bill.a * 0.2;
const tip2 = bill.b >= 50 && bill.b <= 300 ? bill.b * 0.15 : bill.b * 0.2;
const tip3 = bill.c >= 50 && bill.c <= 300 ? bill.c * 0.15 : bill.c * 0.2;
const total = bill.a + tip;
const total2 = bill.b + tip2;
const total3 = bill.b + tip3;


console.log(`The bill was ${bill.a}, the tip was ${tip}, and the total value ${total}`);
console.log(`The bill was ${bill.b}, the tip was ${tip2}, and the total value ${total2}`);
console.log(`The bill was ${bill.c}, the tip was ${tip3}, and the total value ${total3}`);