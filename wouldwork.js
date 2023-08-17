const possibilities = [];

for (let i = 0; i < 10; i++) {
  for (let j = 0; j < 10; j++) {
    for (let k = 0; k < 10; k++) {
      for (let l = 0; l < 10; l++) {
        possibilities.push("917" + i + j + k + l + "928");
      }
    }
  }
}

console.log(possibilities);