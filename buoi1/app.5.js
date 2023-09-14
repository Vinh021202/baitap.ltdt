// Function to calculate the tip based on the bill value
const calcTip = bill => (bill >= 50 && bill <= 300) ? bill * 0.15 : bill * 0.20;

// Test the function with a bill value of 100
const testBill = 100;
const testTip = calcTip(testBill);
console.log(`For a bill of ${testBill}, the tip is ${testTip}`);

// Array of test data
const bills = [125, 555, 44];

// Calculate tips for each bill using the 'calcTip' function
const tips = bills.map(calcTip);

// Calculate the total values (bill + tip)
const totals = bills.map((bill, index) => bill + tips[index]);

console.log("Bills:", bills);
console.log("Tips:", tips);
console.log("Totals:", totals);