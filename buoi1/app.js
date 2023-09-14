//Coding Challenge #1
//Mark and John are trying to compare their BMI (Body Mass Index), which is
//calculated using the formula:
//BMI = mass / height ** 2 = mass / (height * height) (mass in kg and height in meter).
// Your tasks:
//1. Store Mark's and John's mass and height in variables
const mark = {
    markw: 78,
    markh: 1.69

}
const Jhon = {
    JhonW: 92,
    Jhonh: 1.95
}

const mark1 = {
    markw1: 95,
    markh1: 1.88
}

const Jhon1 = {
    JhonW1: 85,
    Jhonh1: 1.76
}

function BMI(mass, height) {
    return mass / (height * height)
}

var BMiM = BMI(mark.markw, mark.markh)
var BMiJ = BMI(Jhon.JhonW, Jhon.Jhonh)
    //2. Calculate both their BMIs using the formula (you can even implement both versions)
console.log("DATA 1");
console.log(`Mark's BMI: ${BMiM.toFixed(2)}`);
console.log(`John's BMI: ${BMiJ.toFixed(2)}`);

//3. Create a Boolean variable 'markHigherBMI' containing information about
// whether Mark has a higher BMI than John.
let markHigherBMI = BMiM > BMiJ;

if (markHigherBMI) {
    console.log("Mark has a higher BMI than John.");
} else {
    console.log("John has a higher BMI than Mark.");
}

var BMiM1 = BMI(mark1.markw1, mark1.markh1)
var BMiJ1 = BMI(Jhon1.JhonW1, Jhon1.Jhonh1)

console.log("DATA 2");
console.log(`Mark's BMI1: ${BMiM1.toFixed(2)}`);
console.log(`John's BMI1: ${BMiJ1.toFixed(2)}`);

let markBMI = BMiM1 > BMiJ1;

if (markBMI) {
    console.log("Mark has a higher BMI than John.");
} else {
    console.log("John has a higher BMI than Mark.");
}

//Coding Challenge #2
//Use the BMI example from Challenge #1, and the code you already wrote, and
//improve it.

//Your tasks:
//1. In một kết quả đẹp ra bảng điều khiển, cho biết ai có chỉ số BMI cao hơn. Thông điệp
//hoặc là "Chỉ số BMI của Mark cao hơn John!" hoặc "Chỉ số BMI của John cao hơn Mark!"
//2. Sử dụng chữ mẫu để bao gồm các giá trị BMI trong kết quả đầu ra. Ví dụ: “Mark
//BMI (28,3) cao hơn John (23,9)!"

console.log("Coding Challenge #2")

if (BMiM > BMiJ) {
    console.log(`Mark's BMI is higher than John's! Mark's BMI : (${BMiM.toFixed(1)})`)
} else {
    console.log(`John's BMI is higher than Mark's!  John's BMI : (${BMiJ.toFixed(1)})`)

}


if (BMiM1 > BMiJ1) {
    console.log(`Mark's BMI is higher than John's! Mark's BMI : (${BMiM.toFixed(1)})`)
} else {
    console.log(`John's BMI is higher than Mark's!  John's BMI : (${BMiJ.toFixed(1)})`)

}