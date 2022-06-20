const myFamily = ["Maritxu", "Kirmen", "Ekaitz", "Adolfo"];
console.log(myFamily);

const myFamilySet = new Set(myFamily);

myFamilySet.add(["Adolfo"]);
console.log(myFamilySet);

myFamilySet.add("Javascript (ya que empieza a formar parte de tu vida ;)");

console.log(myFamilySet);
