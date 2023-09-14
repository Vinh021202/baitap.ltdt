//Coding Challenge #5



// Function to calculate the average of 3 scores
const calculate = (a1, a2, a3) => (a1 + a2 + a3) / 3

// Function to check the winner and log the result
const checkWin = (avgDolhins, avgKoalas) => {
    if (avgDolhins >= avgKoalas) {
        console.log(`Dolphins win (${avgDolhins} vs. ${avgKoalas})`);
    } else if (avgKoalas >= avgDolhins) {
        console.log(`Koalas win (${avgKoalas} vs. ${avgDolhins})`);
    } else {
        console.log("No team wins!");
    }
}

// Test Data

const dolphinsScores1 = [44, 23, 71];
const koalasScores1 = [65, 54, 49];
const dolphinsScores2 = [85, 54, 41];
const koalasScores2 = [23, 34, 27];

// Calculate the average scores
const avgDolphins1 = calculate(...dolphinsScores1);
const avgKoalas1 = calculate(...koalasScores1);
const avgDolphins2 = calculate(...dolphinsScores2);
const avgKoalas2 = calculate(...koalasScores2);

// Check the winners
console.log("Data 1:");
checkWin(avgDolphins1, avgKoalas1);

console.log("Data 2:");
checkWin(avgDolphins2, avgKoalas2);