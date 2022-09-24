//PRUEBAS CON LET Y VAR

// *** PRUEBA CON VAR ***
var num = 40;
console.log(num); //VALOR 40
if (true){
    var num = 50;
    console.log(num); //VALOR 50
}

console.log(num); //VALOR 50

// ***PRUEBA CON LET ***
var txt = "Curso JS de victorroblesweb.es";
console.log(txt); //valor JS

if(true){
    let txt = "Curso Laravel 5 de victorrobles.es";
    console.log(txt); //Valor Laravel5
}

console.log(txt); //Valor JS
