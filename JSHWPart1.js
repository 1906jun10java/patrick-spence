window.onload = function () {

}
//fibonacci nth number 
function fibonacci (num3){
    if(num1 == 0){
        return 0;
    }else if(num2 == 1){
        return 1;
    }else if((num1-1)+(num2-2)){
        return num3;
    }
}
//sorting Arrays
function sortArrays(numbArrays){
    let numbArrays =[2,4,5,1,3,1];
    for (let i = 0; i <= numbArrays.length; i++){
        console.log(numbArrays);
    }
    numbArrays[5]= numbArrays[0]; //[1,4,5,1,3,2]
    numbArrays[3]= numbArrays[2]; //[1,1,5,4,3,2]
    numbArrays[5]= numbArrays[2]; //[1,1,2,4,3,5]
    numbArrays[4]= numbArrays[3]; //[1,1,2,3,4,5]
    console.log(numbArrays);
    return numbArrays;
}
//factorial at nth number 
function returnFactorial(num1){
return num1* factorialize(num1-1);
}
factorialize(5); 
//rotate the Array nth time
function rotateArrayLeft(a1){
    let a1 =[1,2,3,4,5];
    console.log(a1); //[1,2,3,4,5]
    
    a1[0]=a1[1];
    a1[1]=a1[2];
    a1[2]=a1[3];
    a1[3]=a1[4];
    console.log(a1); //[2,3,4,5,1]
    return a1;
}
//rotate the Array nth time
function rotateArrayLeft(a2){
    let a2 =[1,2,3,4,5];
    console.log(a2); //[1,2,3,4,5]
    
    //rotating 6 times to the left
    let ele1 = a2.shift(a2);
    a2.push(ele1); 
    return a2;
}
//rotate the Array nth time
function rotateArrayLeft(a3){
    let a3 =[1,2,3,4,5];
    console.log(a3); //[1,2,3,4,5]

    //rotating 3 times to the left
    
}