const form = document.querySelector('form');

const imc = () => {

    let nome = document.querySelector('#nome').value;
    let peso = document.querySelector('#peso').value.replace(",",".");
    let altura = document.querySelector('#altura').value.replace(",",".");;

    let imc = peso/(altura*altura);

     if(imc<18.5){
        document.querySelector('#result').innerHTML ='<br>'+nome+ ' seu imc é: '+ imc.toFixed(2)+'<br>' +
        'Você está com baixo peso!';
    }else if (18.5<=imc && imc<24.9){
        document.querySelector('#result').innerHTML ='<br>'+ nome + 'seu imc é:'+ imc.toFixed(2)+'<br>'+ 
        'Você está com o peso normal!';
        
    } else if (imc >= 25 && imc < 29.9) {

        document.querySelector('#result').innerHTML =
            '<br>'+nome + ' seu IMC é: ' + imc.toFixed(2) + '<br>' +
            'Você está com sobrepeso!';

    } else {

        document.querySelector('#result').innerHTML =
           '<br>'+ nome + ' seu IMC é: ' + imc.toFixed(2) + '<br>' +
            'Você está com obesidade!';

    }



    form.reset();

};


form.addEventListener('submit', function(event){

    //anular o subimit

    event.preventDefault();
    
    //chamar a arrow function
    imc();


});