//module.exports = constant add = (x,y) => (x+y);

export default class  Addition {

    constructor(first,second) {
        this._first = first;
        this._second = second;
    }

    add() {
        return this._first + this._second;
    }

}