export class Bed{
    constructor(
        public bId:number,
        public alertStatus:number,
        public dateOfAdmit:string,
        public dpt:string,
        public patientId:number,
        public xCoordinate:number,
        public yCoordinate:number
    ){}
}