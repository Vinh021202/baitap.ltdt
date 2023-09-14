//Coding Challenge #3
//There are two gymnastics teams, Dolphins and Koalas. They compete against each
//other 3 times. The winner with the highest average score wins a trophy!

//test data
const dolphins = [96, 108, 89]
const koalas = [97, 112, 101]

// Function to calculate the average score
function calculateAverage(scores) {
    let sum = 0;
    for (let i = 0; i < scores.length; i++) {
        sum += scores[i];
    }
    return sum / scores.length;
}

const dolphinsAverage = calculateAverage(dolphins);
const koalasAverage = calculateAverage(koalas);

console.log(dolphinsAverage)
console.log(koalasAverage)

const mini = 100;

if (dolphinsAverage >= 100 && dolphinsAverage > koalasAverage) {
    console.log("Dolphins win!")
} else if (koalasAverage >= 100 && koalasAverage > dolphinsAverage) {
    console.log("Koalas win!")
} else if (dolphinsAverage >= minimumScore && koalasAverage >= minimumScore && dolphinsAverage === koalasAverage) {
    console.log("It's a draw!")
} else {
    console.log("No team wins the trophy.")
}

console.log("TEST DATA2")

//test data 2 
const dolphins1 = [97, 112, 101]
const koalas1 = [109, 95, 123]

const dolphinsa1 = calculateAverage(dolphins1)
const koalasa1 = calculateAverage(koalas1)

console.log(dolphinsa1)
console.log(koalasa1)

if (dolphinsa1 >= 100 && dolphinsa1 > koalasa1) {
    console.log("Dolphins win!")
} else if (koalasa1 >= 100 && koalasa1 > dolphinsa1) {
    console.log("Koalas win!")
} else if (dolphinsa1 >= minimumScore && koalasa1 >= minimumScore && dolphinsa1 === koalasa1) {
    console.log("It's a draw!")
} else {
    console.log("No team wins the trophy.")
}

console.log("TEST DATA3")
    //Test Data3

const dolphins2 = [97, 112, 101]
const koalas2 = [109, 95, 106]

const dolphinsa2 = calculateAverage(dolphins2)
const koalasa2 = calculateAverage(koalas2)

console.log(dolphinsa2)
console.log(koalasa2)

if (dolphinsa2 >= 100 && dolphinsa2 > koalasa2) {
    console.log("Dolphins win!")
} else if (koalasa2 >= 100 && koalasa2 > dolphinsa2) {
    console.log("Koalas win!")
} else if (dolphinsa2 >= 100 && koalasa2 >= 100 && dolphinsa2 === koalasa2) {
    console.log("It's a draw!")
} else {
    console.log("No team wins the trophy.")
}