
let apiBrew;
let breweryArr;
let cityText;
let stateText;
let nameText;

let getInfo = function() {
document.getElementById('contianer').innerText = "";
cityText = document.getElementById('cityBrew').value;
stateText = document.getElementById('stateBrew').value;
nameText = document.getElementById('nameBrew').value;
}

let getUrl = function(){
    getInfo();
    apiBrew = "https://api.openbrewerydb.org/breweries?by_name=" + nameText + "&by_city=" + cityText + "&by_state=" + stateText + "&page=1&per_page=30";
    getBrewAsync();
}
let apiPage2 = function(){
    getInfo();
    apiBrew = "https://api.openbrewerydb.org/breweries?by_name=" + nameText + "&by_city=" + cityText + "&by_state=" + stateText + "&page=2&per_page=30";
    getBrewAsync();
}
let apiPage3 = function(){
    getInfo();
    apiBrew = "https://api.openbrewerydb.org/breweries?by_name=" + nameText + "&by_city=" + cityText + "&by_state=" + stateText + "&page=3&per_page=30";
    getBrewAsync();
}
let apiPage4 = function(){
    getInfo();
    apiBrew = "https://api.openbrewerydb.org/breweries?by_name=" + nameText + "&by_city=" + cityText + "&by_state=" + stateText + "&page=4&per_page=30";
    getBrewAsync();
}
let apiPage5 = function(){
    getInfo();
    apiBrew = "https://api.openbrewerydb.org/breweries?by_name=" + nameText + "&by_city=" + cityText + "&by_state=" + stateText + "&page=5&per_page=30";
    getBrewAsync();
}
//Function that graps info from my api
let getBrewAsync = async function(){
    try {
    // Uses the exact url that was given to fetch the info 
    const response = await fetch(apiBrew)
    // Grab the array of objects and assign them to the breweryArr var
    breweryArr = await response.json();
    console.log(breweryArr);
    // Call the updateContent function
    updateContent();
    // If 'try' wasnt successful execute 'catch'
    } catch (err) {
    console.log('Something went wrong. :(');
    console.log(err);    
    }
}

// This function creates the elements in html that contains the info
// that 
let updateContent = function(){

    for(let i = 0; i < breweryArr.length; i++){

        let con = document.getElementById('contianer');
    
        let bA = breweryArr[i];

        let barCon = document.createElement('div');
        barCon.classList.add('bar-container');
        barCon.classList.add('hidden');

        let barnameDiv = document.createElement('div');
        barnameDiv.classList.add('bar-name');
        barnameDiv.innerText = bA.name;
        
        let barLo = document.createElement('div');
        barLo.classList.add('bar-loc');
    
        let barCity = document.createElement('div');
        barCity.classList.add('bar-city');
        barCity.innerText = bA.city;
    
        let barState = document.createElement('div');
        barState.classList.add('bar-state');
        barState.innerText = bA.state;

        let barContact = document.createElement('div');
        barContact.classList.add('bar-contact');

        let linkCon = document.createElement('div');
        linkCon.classList.add('website-con');
        
        let webText = document.createElement('a');
        webText.href = bA.website_url;
        webText.innerText = 'Check out their website!'

        let phoneNum = document.createElement('div');
        phoneNum.classList.add('phone');
        phoneNum.innerText = bA.phone;
    
    
        con.appendChild(barCon);
        barCon.appendChild(barnameDiv);
        barCon.appendChild(barLo);
        barLo.appendChild(barCity);
        barLo.appendChild(barState);
        barCon.appendChild(barContact);
        barContact.appendChild(linkCon);
        linkCon.appendChild(webText);
        barContact.appendChild(phoneNum);

        setTimeout(() => barCon.classList.remove('hidden'), 200*i);
    }

}