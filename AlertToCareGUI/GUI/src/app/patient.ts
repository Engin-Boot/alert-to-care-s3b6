export class Patient{
    constructor(
        public pId:number,
        public pName:string,
        public phoneNum:number,
        public dateOfAdmit:string,
        public dateOfDischarge:string
    ){}
}