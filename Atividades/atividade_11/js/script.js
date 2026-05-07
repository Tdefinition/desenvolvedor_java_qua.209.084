const form = document.querySelector('form');

const imc = () => {

    let nome = document.querySelector('#nome').value;
    let peso = document.querySelector('#peso').value;
    let altura = document.querySelector('#altura').value;

    let imc = peso/(altura*altura);

     if(imc<18.5){
        document.querySelector('#result').innerHTML = nome+' ' + ' seu imc é: '+ imc+'<br>' 
        'Você está com baixo peso!';
    }else if (18.5<=imc && imc<24.9){
        document.querySelector('#result').innerHTML = nome + 'seu imc é:'+ imc+'<br>'+ 
        'Você está com o peso normal!';
        
    }



    form.reset();

};


form.addEventListener('submit', function(event){

    //anular o subimitt

    event.preventDefault();
    
    //chamar a arrow function
    imc();


});