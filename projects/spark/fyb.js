

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

let apiBrew = "https://api.openbrewerydb.org/breweries?by_city=chicago&page=1&per_page=20";
let breweryArr;
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
//breweryArr = [{"id":2420,"name":"Horse Thief Hollow Brewery","brewery_type":"brewpub","street":"10426 S Western Ave","city":"Chicago","state":"Illinois","postal_code":"60643-2508","country":"United States","longitude":"-87.6819511632652","latitude":"41.70388555","phone":"7737792739","website_url":"http://www.horsethiefbrewing.com","updated_at":"2018-08-24T00:31:16.933Z"},{"id":2472,"name":"Off Color Brewing","brewery_type":"micro","street":"3925 W Dickens Ave","city":"Chicago","state":"Illinois","postal_code":"60647-3453","country":"United States","longitude":"-87.7253843735564","latitude":"41.9189269656549","phone":"","website_url":"http://www.offcolorbrewing.com","updated_at":"2018-08-24T00:31:42.250Z"},{"id":2314,"name":"Alarmist Brewing Co","brewery_type":"micro","street":"4055 W Peterson Ave Ste REAR","city":"Chicago","state":"Illinois","postal_code":"60646-6072","country":"United States","longitude":null,"latitude":null,"phone":"7739882536","website_url":"http://alarmistbrewing.com","updated_at":"2018-08-11T21:37:07.640Z"},{"id":2322,"name":"Ballast Point Brewing Company","brewery_type":"planning","street":"","city":"Chicago","state":"Illinois","postal_code":"60607","country":"United States","longitude":null,"latitude":null,"phone":"","website_url":"","updated_at":"2018-08-11T21:37:07.888Z"},{"id":2308,"name":"5 Rabbit Cerveceria Inc","brewery_type":"micro","street":"6398 W 74th St","city":"Chicago","state":"Illinois","postal_code":"60638-6129","country":"United States","longitude":"-87.6572069","latitude":"41.7595502","phone":"3128959591","website_url":"http://www.5rabbitbrewery.com","updated_at":"2018-08-24T00:30:23.637Z"},{"id":2315,"name":"Aleman Brewing","brewery_type":"micro","street":"3304 N Knox Ave","city":"Chicago","state":"Illinois","postal_code":"60641-4434","country":"United States","longitude":"-87.7430121293159","latitude":"41.9408799441355","phone":"8123404198","website_url":"http://www.alemanchicago.com","updated_at":"2018-08-24T00:30:27.173Z"},{"id":2316,"name":"All Rise Brewing Co","brewery_type":"brewpub","street":"235 N Ashland Ave","city":"Chicago","state":"Illinois","postal_code":"60607-1401","country":"United States","longitude":"-87.6667328","latitude":"41.8864021","phone":"3122266300","website_url":"http://www.allrisebrewing.com","updated_at":"2018-08-24T00:30:27.842Z"},{"id":2319,"name":"Argus Brewery","brewery_type":"micro","street":"11314 S Front Ave","city":"Chicago","state":"Illinois","postal_code":"60628-5007","country":"United States","longitude":"-87.6120684544394","latitude":"41.68854885","phone":"7739414050","website_url":"http://www.argusbrewery.com","updated_at":"2018-08-24T00:30:28.900Z"},{"id":2326,"name":"Begyle Brewing","brewery_type":"micro","street":"1800 W Cuyler Ave Ste 1E","city":"Chicago","state":"Illinois","postal_code":"60613-3892","country":"United States","longitude":null,"latitude":null,"phone":"7736616963","website_url":"http://www.begylebrewing.com","updated_at":"2018-08-11T21:37:08.005Z"},{"id":2340,"name":"Brewery In Planning - Chicago","brewery_type":"planning","street":"","city":"Chicago","state":"Illinois","postal_code":"60640-4006","country":"United States","longitude":null,"latitude":null,"phone":"","website_url":"","updated_at":"2018-08-11T21:37:08.468Z"},{"id":2348,"name":"Buchanan Craft LLC","brewery_type":"planning","street":"","city":"Chicago","state":"Illinois","postal_code":"60647-9735","country":"United States","longitude":null,"latitude":null,"phone":"6307722199","website_url":"","updated_at":"2018-08-11T21:37:08.694Z"},{"id":2370,"name":"Dryhop Brewers","brewery_type":"micro","street":"3155 N Broadway St","city":"Chicago","state":"Illinois","postal_code":"60657-4508","country":"United States","longitude":null,"latitude":null,"phone":"7738573155","website_url":"http://www.dryhopchicago.com","updated_at":"2018-08-11T21:37:09.591Z"},{"id":2332,"name":"Birreria @ Eataly","brewery_type":"brewpub","street":"43 E Ohio St","city":"Chicago","state":"Illinois","postal_code":"60611-2701","country":"United States","longitude":"-87.6262332","latitude":"41.89209845","phone":"","website_url":"http://www.eataly.com","updated_at":"2018-08-24T00:30:34.707Z"},{"id":2352,"name":"Burnt City Brewing","brewery_type":"micro","street":"2747 N Lincoln Ave","city":"Chicago","state":"Illinois","postal_code":"60614-1320","country":"United States","longitude":"-87.6572273154071","latitude":"41.93185255","phone":"7732951270","website_url":"http://www.burntcitybrewing.com","updated_at":"2018-08-24T00:30:40.707Z"},{"id":2357,"name":"Chicago Beer Company","brewery_type":"contract","street":"1140 W Randolph St","city":"Chicago","state":"Illinois","postal_code":"60607-1619","country":"United States","longitude":"-87.6558916515504","latitude":"41.8843399958366","phone":"7732448696","website_url":"http://www.chicagobeerco.com","updated_at":"2018-08-24T00:30:42.837Z"},{"id":2359,"name":"Corridor Brewery \u0026 Provisions","brewery_type":"brewpub","street":"3446 N Southport Ave","city":"Chicago","state":"Illinois","postal_code":"60657-1420","country":"United States","longitude":"-87.6643524","latitude":"41.9447594","phone":"7732704272","website_url":"","updated_at":"2018-08-24T00:30:43.998Z"},{"id":2360,"name":"Cruz Blanca Brewery","brewery_type":"brewpub","street":"904 W Randolph St","city":"Chicago","state":"Illinois","postal_code":"60607-2208","country":"United States","longitude":"-87.6501403","latitude":"41.8846013","phone":"3127331975","website_url":"http://www.cruzblanca.com","updated_at":"2018-08-24T00:30:44.521Z"},{"id":2368,"name":"Dovetail Brewery","brewery_type":"micro","street":"1800 W Belle Plaine Ave","city":"Chicago","state":"Illinois","postal_code":"60613-1827","country":"United States","longitude":"-87.6743858","latitude":"41.9561589","phone":"","website_url":"http://www.dovetailbrewery.com","updated_at":"2018-08-24T00:30:49.041Z"},{"id":2392,"name":"Gino's Brewing Company","brewery_type":"brewpub","street":"500 N La Salle Dr","city":"Chicago","state":"Illinois","postal_code":"60654-7109","country":"United States","longitude":null,"latitude":null,"phone":"3129884200","website_url":"","updated_at":"2018-08-11T21:37:11.071Z"},{"id":2395,"name":"Goose Island Brewpub","brewery_type":"large","street":"1800 N Clybourn Ave Ste B","city":"Chicago","state":"Illinois","postal_code":"60614-4895","country":"United States","longitude":null,"latitude":null,"phone":"3129150071","website_url":"http://www.gooseisland.com","updated_at":"2018-08-11T21:37:11.293Z"}];
// let getBrews = function(){

// for(let i = 0; i < breweryArr.length; i++){

//     let con = document.getElementById('contianer');

//     let bA = breweryArr[i];
    
//     let barCon = document.createElement('div');
//     barCon.classList.add('bar-container');

//     let barnameDiv = document.createElement('div');
//     barnameDiv.classList.add('bar-name');
//     barnameDiv.innerText = bA.name;

//     let barInfo = document.createElement('div');
//     barInfo.classList.add('bar-info');

//     let barCity = document.createElement('div');
//     barCity.classList.add('bar-city');
//     barCity.innerText = bA.city;

//     let barState = document.createElement('div');
//     barState.classList.add('bar-state');
//     barState.innerText = bA.state;



//     con.appendChild(barCon);
//     barCon.appendChild(barnameDiv);
//     barCon.appendChild(barInfo);
//     barInfo.appendChild(barCity);
//     barInfo.appendChild(barState);
//     }
// }


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



