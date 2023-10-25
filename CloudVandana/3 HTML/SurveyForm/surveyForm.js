function submitForm() {
    let firstName = document.getElementById('first-name').value;
    let lastName = document.getElementById('last-name').value;
    let dob = document.getElementById('dob').value;
    let country = document.getElementById('country').value;
    let gender = document.querySelector('input[name="gender"]:checked').value;
    let profession = document.getElementById('profession').value;
    let email = document.getElementById('email').value;
    let mobile = document.getElementById('mobile').value;
    if (firstName && lastName && dob && country && gender && profession && email && mobile) {
        let flag=true;
        if( mobile.length!=10){
            flag=false;
            alert("Mobile number is not valid");
        }else{
            for(let digit of mobile){
                if(isNaN(digit)){
                    flag=false;
                    alert("Mobile number is not valid");
                    break;
                }
            }  
        }
        if(flag===true){
            alert("Submitted details are: \nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nDate of birth: "+dob+"\nCountry: "+country+"\nGender: "+gender+"\nProfession: "+profession+"\nEmail: "+email+"\nMobile: "+mobile+"\n");
            document.getElementById('survey-form').reset();
        }
    }
}

function genderSelection() {
    const male = document.getElementById('male');
    const female = document.getElementById('female');

    if (female.checked) {
        male.checked = false;
    }
}

