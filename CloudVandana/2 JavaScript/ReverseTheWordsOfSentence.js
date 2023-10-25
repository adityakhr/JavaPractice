function ReverseTheWordsOfSentence(array,size) {
    for(let i=0 ; i<size-1 ; ++i){
        let swap = 0;
        for(let j = i+1 ; j<size ; ++j){
            if(array[i]<array[j]){
                let temp = array[i];
                array[i]=array[j];
                array[j]=temp;
                ++swap;
            }
        }
        if(swap==0){
            break;
        }
    }
    return array;
}

function runProgram(input) {
    input=input.trim().split("\n");
    let size = +input[0];
    let array= input[1].trim().split(" ").map(Number);
    console.log(ReverseTheWordsOfSentence(array,size));
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