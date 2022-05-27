package com.company;

public class Main {
/*
20 работа. Необходимо создать класс, работающий с напряжением 380 вольт и создать класс работающий с зарядным устройством 220 вольт.
 Создать класс адаптер, который позволит заряжать телефон зарядным устройством 220 вольт через напряжение в 380 вольт.
 */
static class _380wcl implements _380w{
    @Override
    public void chardching_380w() {
        System.out.println("380w");
    }
}
interface _380w{
    void chardching_380w();
}

interface _220w{
    void chardching_220w();
}
static class _220cl implements _220w{
    @Override
    public void chardching_220w() {
        System.out.println("220w ");
    }
}
static class adapterCharge implements _220w {
    private _380w qxqCharge;
    public adapterCharge( _380w qxqCharge){
        this.qxqCharge = qxqCharge;
    }
public void qqpow(){
    qxqCharge.chardching_380w();
}
    @Override
    public void chardching_220w() {
        System.out.println("заряжает 220w");
    }
}
    public static void main(String[] args) {
	_220cl qq = new _220cl();
    _380wcl qxq = new _380wcl();
    adapterCharge tttt = new adapterCharge(qxq);
    tttt.chardching_220w();
    }
}
