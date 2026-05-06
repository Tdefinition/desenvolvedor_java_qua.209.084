// js é uma linguagem orientada à eventos

//como declarar uma variável com no js (js tem uma tipagem dinamica ao contrário do javaque é tipada. Ou seja a variavel vai ser do
// tipo que o usuário inserir e não o tipo que eu pré-estabeleci):
//se eu declaro uma variavel no js eu devo imediatamente inicializá-la

const form = document.querySelector('form');

//criar o o evento:
form.addEventListener('submit', function(event){
//o add Event list recebe sempre o nome do evento e a ação 
event.preventDefault();// para o buttun de funcionar para não enviar mais dados para esse form
//declararação de variável para armazenar os dados do form em alguma variavel
let nome = document.querySelector('#nome').value ;

//exibe a caixa de dialogo 
alert(nome);
});
//podem declarar as variaveis:
//let



//DOM = Document Object Model   qnd eu esotu usando a palavra document eu estou utilizando o DOM
