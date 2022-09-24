var coche = {
    modelo: "Mercedes",
    maxima: 500,
    antiguedad: 2020,
    mostrarDatos(){
        console.log(this.modelo,this.maxima, this.antiguedad);
    },
};

document.write(`<h1>` + coche.modelo + `</h1>`);
coche.mostrarDatos;
console.log(coche);