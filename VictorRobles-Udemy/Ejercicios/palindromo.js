//Dada una cadena de texto, indicar si es un palindromo o no.
/* - Funcion con parametro texto
- Separar el texto en un array de letras
- Darle la vuelta
- Unir el array de letras en un String y comparar con el parametro */

/* function palindromo(palabra){
    let array = palabra
                    .split("")
                    .reverse()
                    .join("");
    if (array === palabra) {
        console.log("Es un palindromo");
    } else {
        console.log("No es un palindromo");
    }
    console.log("La palabra ingresada es: " + palabra);
}


palindromo("anitalavalatina"); */


function palindromo(palabra){
    let array = palabra
                    .split("")
                    .reverse()
                    .join("");
    return (array === palabra);
}

console.log("Es un palindromo?" + palindromo("anitalavalatina"));