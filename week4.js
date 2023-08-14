let addUp = (num) => {

    if (num === 1) {
        return 1;
    } else {
        return num + addUp(num - 1);
    }

}

console.log(addUp(4));
console.log(addUp(13));
console.log(addUp(600));