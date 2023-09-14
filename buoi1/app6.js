//Coding Challenge #7

const mark = {
    fullName: 'Mark Miller',
    markw: 78,
    markh: 1.69

}
const Jhon = {
    fullName: 'John Smith',
    JhonW: 92,
    Jhonh: 1.95
}

function BMI(mass, height) {
    return mass / (height * height)
}

var BMiM = BMI(mark.markw, mark.markh)
var BMiJ = BMI(Jhon.JhonW, Jhon.Jhonh)

// Compare BMIs and log the result
if (BMiM > BMiJ) {
    console.log(`${mark.fullName}'s BMI (${BMiM.toFixed(1)}) is higher than ${Jhon.fullName}'s (${BMiJ.toFixed(1)})!`);
} else if (BMiJ > BMiM) {
    console.log(`${John.fullName}'s BMI (${BMiJ.toFixed(1)}) is higher than ${mark.fullName}'s (${BMiM.toFixed(1)})!`);
} else {
    console.log(`${mark.fullName} and ${John.fullName} have the same BMI (${BMiM.toFixed(1)})!`);
}