package zufallsgenerator;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4fd280e8-de22-4351-b3c3-127ffa82f1a9")
public class TesterTester extends ZufallsgeneratorPrototyp {
    @objid ("cebc980a-7d7c-41c9-b15b-85ae05f68691")
    public TesterTester() {
        // TODO Auto-generated constructor stub
    }

    @objid ("889f84ad-a1b7-43f6-b2e2-cfa938a30fa2")
    @Override
    public int getRnd() {
        return (int)(Math.random()*10+1);
    }

    @objid ("12342b22-c46a-4524-a1f0-02c6f9796e47")
    @Override
    public int getSeed() {
        // TODO Auto-generated method stub
        return 0;
    }

    @objid ("192c679a-acf4-46de-be77-80ff66bd03a7")
    @Override
    public void resetSequence() {
        // TODO Auto-generated method stub
    }

    @objid ("54fcb405-fe57-4a4b-8c95-01aa0ff2ba00")
    @Override
    public void showDialog() {
        // TODO Auto-generated method stub
    }

    @objid ("f44454c5-31d9-4f72-a2ba-45049e53a8e9")
    @Override
    public void forceClose() {
        // TODO Auto-generated method stub
    }

    @objid ("d3184829-4017-4eaa-b255-810af05443b8")
    @Override
    public void setSeed() {
        // TODO Auto-generated method stub
    }

}
