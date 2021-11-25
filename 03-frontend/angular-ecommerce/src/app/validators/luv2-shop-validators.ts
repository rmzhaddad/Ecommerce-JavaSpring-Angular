import { FormControl, ValidationErrors } from "@angular/forms";

export class Luv2ShopValidators {

    //whitespace validationn
    static notOnlyWhitespace(control: FormControl): ValidationErrors {

        // check if string only contains whitespac
        if ((control.value != null) && (control.value.trim().length === 0)) {

            //invalid , return error object
            return { 'notOnlyWhitespace': true };
        }
        else {

            return null;
        }
    }

}
