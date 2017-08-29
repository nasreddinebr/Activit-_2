var mots = [], motSaisie = " ";
while (motSaisie !== "stop") {
	motSaisie = window.prompt("Entrer un mot ou taper stop pour quitter:");
	if (motSaisie === "stop") {
		console.log("A biento!!!");
	} else {
		mots.push(motSaisie)
	}
	
}

console.log("Vous avez saisie les mots suivants:");
mots.forEach(function (mot) {
	console.log(mot);
});
