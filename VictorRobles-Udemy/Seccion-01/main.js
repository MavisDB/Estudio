/* function MuestraNombre(nom, altura) {
    var datos = document.getElementById ("datos");
    datos.innerHTML = `
    <h1> Soy la caja de datos </h1>
    <h2> Mi nombre es: ${nom}</h2>
    <h3> Mido: ${altura}cm</h3>
    `;
} 

MuestraNombre("Mitzi", 157); */

function MuestraMiNombre(nom, altura){
    var misDatos = `
    <h1> Soy la caja de datos </h1>
    <h2> Mi nombre es: ${nom}</h2>
    <h3> Mido: ${altura}cm</h3>
    `;
    return misDatos;
}

function imprimir(){
    var datos = document.getElementById ("datos");
    datos.innerHTML = MuestraMiNombre("Danielita Sanchez", 157);
}

imprimir();

var noms = ["Mitzi", "Daniela", "Bruno"];

/* for(i = 0; i<noms.length; i++){
    document.write(noms[i] + `<br>`);
} */

/* noms.forEach(function(nom){
    document.write(nom + `<br>`);
}); */

noms.forEach((nom) =>{
    document.write(nom + `<br>`);
});