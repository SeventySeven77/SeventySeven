package springTest03.dao.Impl;

import springTest03.dao.TargetInterface;

public class targetInterfaceImpl implements TargetInterface {
    @Override
    public void save() {
        System.out.println("saving something...");
        //int i = 1/0;
    }
}
