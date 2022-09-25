/* Dada una palabra, buscarla en una frase y devolver cuantas veces aparece en la frase y la palabra deben ser parametros de una funcion */

function busquedaPalabra(texto, palabra){
    let txt_limpiar = texto.toLowerCase().replace(/[!¡.,-]/gi, "");
    let  resultado = 0;
    

    if(txt_limpiar.includes(palabra)){
        let palabras = txt_limpiar.split(" ");
        let mapa = {};

    for(let unidad of palabras){
        if(mapa[unidad]){
            mapa[unidad]++;
        }else{
            mapa[unidad] = 1;
        }
    }
    resultado = mapa[palabra];

    }else{
        resultado = 0;
    }
    return resultado;
}

console.log("Numero de coincidencias en la frase: ",
busquedaPalabra("hola como. estas, hoy hoy hoY!", "hoy"));