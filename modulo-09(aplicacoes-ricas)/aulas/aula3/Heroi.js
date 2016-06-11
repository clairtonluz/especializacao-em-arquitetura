/**
 * Created by clairton on 11/06/16.
 */
function Poder(nome) {
    this.ativar = function () {
        console.log(nome);
    }
}

function Heroi(indentidadeSecreta, nome, poder) {
    this.indentidadeSecreta = indentidadeSecreta;
    this.nome = nome;
    this.ativarPoder = poder.ativar;
}

var poder = new Poder("Hadouken");
var ryu = new Heroi("Ryu Secreto", "Ryu", poder);

ryu.ativarPoder();