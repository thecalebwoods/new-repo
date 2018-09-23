

// let apiBrew = "https://api.openbrewerydb.org/breweries?by_city=chicago";

// let getBrewAsync = async function(){
//     try {
//     const response = await fetch(apiBrew)
//     state = (await response.json());
//     updateContent();
//     } catch (err) {
//     console.log('Something went wrong. :(');
//     console.log(err);    
//     }
// }

// let updateContent = function(){
//     console.log(state);
// }
let apiBrew;
let breweryArr;
let cityText;
let stateText;

let getUrl = function(){
    cityText = document.getElementById('cityBrew').value;
    stateText = document.getElementById('stateBrew').value;
    apiBrew = "https://api.openbrewerydb.org/breweries?by_city=" + cityText + "&by_state=" + stateText + "&page=1&per_page=50";
    getBrewAsync();
}

let getBrewAsync = async function(){
    try {
    const response = await fetch(apiBrew)
    breweryArr = await response.json();
	console.log(breweryArr);
	updateContent();
    } catch (err) {
    console.log('Something went wrong. :(');
    console.log(err);    
    }
}

let updateContent = function(){

    for(let i = 0; i < breweryArr.length; i++){

        let con = document.getElementById('contianer');
    
        let bA = breweryArr[i];
        
        let barCon = document.createElement('div');
        barCon.classList.add('bar-container');
    
        let barnameDiv = document.createElement('div');
        barnameDiv.classList.add('bar-name');
        barnameDiv.innerText = bA.name;
    
        let barInfo = document.createElement('div');
        barInfo.classList.add('bar-info');
    
        let barCity = document.createElement('div');
        barCity.classList.add('bar-city');
        barCity.innerText = bA.city;
    
        let barState = document.createElement('div');
        barState.classList.add('bar-state');
        barState.innerText = bA.state;
    
    
    
        con.appendChild(barCon);
        barCon.appendChild(barnameDiv);
        barCon.appendChild(barInfo);
        barInfo.appendChild(barCity);
        barInfo.appendChild(barState);
        }
}

