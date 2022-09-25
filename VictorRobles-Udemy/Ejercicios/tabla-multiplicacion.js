//Dado un numero, devolver su tabla de multiplicar completa
//Como lo haria
/* Funcion con parametros "numero"
- Variable con texto encabezado
- Bucle del 1 al 10
- Concatenar a la variable String con multiplicacion y resultado */

function multiplicacion(num) {
    
    for(var i=1; i<=10; i++){
        r = num*i;
        console.log(num + " x " + i + " = " + r);
    }
}
multiplicacion(8);

function tablaMultiplicar(num){
    let r = `Tabla de multiplicar del ${num} \n`;
    for(let i=1; i<=10; i++){
       let mul = (i*num);
       r += `${i} x ${num} = ${mul} \n`;
    }
    return r;
}
console.log(tablaMultiplicar(6));