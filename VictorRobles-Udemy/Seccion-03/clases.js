class Coche {
    constructor(modelo, velocidad, antiguedad){
    this.modelo = modelo;
    this.velocidad = velocidad;
    this.antiguedad = antiguedad; 

    }
    aumentarVelocidad(){
        this.velocidad += 1;
    }

    reducirVelocidad(){
        this.velocidad -= 1;
    }
}

var coche1 = new Coche("BMW", 200, 2017);
var coche2 = new Coche("Audi", 200, 2017);
var coche3 = new Coche("Mercedes", 200, 2017);

console.log(coche1);
document.write("<h1> Velocidad:" +coche1.velocidad+ " </h1>");

coche1.aumentarVelocidad();
coche1.aumentarVelocidad();
coche1.aumentarVelocidad();

document.write("<h1> Velocidad:" +coche1.velocidad+ " </h1>");
