//Question 3
const expenses = [
  { category: "Food", amount: 120 },
  { category: "Travel", amount: 300 },
  { category: "Food", amount: 80 },
  { category: "Bills", amount: 200 },
  { category: "Travel", amount: 100 },
];

function getCategorySummary(expenses) {
  for (key in expenses) {
    console.log(`key value ${category} is ${expenses[amount]}`);
  }
}
expenses();

console.log("=================================================");

//Question 2
function array1(num) {
  return function (num) {
    return function (num) {
      console.log();
    };
  };
}

array1(3, 2, 1)(4, 5, 2)(1, 6);

console.log("=================================================");
//Question 1
