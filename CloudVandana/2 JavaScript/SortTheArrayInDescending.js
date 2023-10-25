function reverseWords(sentence) {
    let arr = sentence.trim().split(" ");
    for(let i=0 ; i<arr.length ; ++i){
        arr[i] = arr[i].split("").reverse().join("");
    }
    return arr.join(" ");
}

function runProgram(input) {
  console.log(reverseWords(input));
}

if (process.env.USER === "") {
  runProgram(``);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function(input) {
    read += input;
  });
  process.stdin.on("end", function() {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function() {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
}