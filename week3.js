function LongestWord(sen) { 

  var arr = sen.match(/[a-z]+/gi);

  var sorted = arr.sort(function(a, b) {
    return b.length - a.length;
  });

  return sorted[0];
         
}
   
// keep this function call here 
LongestWord(readline());