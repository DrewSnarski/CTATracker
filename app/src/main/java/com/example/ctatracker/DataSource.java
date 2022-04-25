package com.example.ctatracker;

import java.util.ArrayList;

public class DataSource {
    private ArrayList<Integer> linesPool;
    private ArrayList<Integer> trainsPool;
    private ArrayList<Integer> purpleStations;
    private ArrayList<Integer> yellowStations;
    private ArrayList<Integer> redStations;
    private ArrayList<Integer> blueStations;
    private ArrayList<Integer> greenStations;
    private ArrayList<Integer> pinkStations;
    private ArrayList<Integer> brownStations;
    private ArrayList<Integer> orangeStations;


    public ArrayList<Integer>getLines(){
        return linesPool;
    }
    public ArrayList<Integer>getTrains(){
        return trainsPool;
    }
    public ArrayList<Integer>getPurpleStations(){
        return purpleStations;
    }
    public ArrayList<Integer>getYellowStations(){
        return yellowStations;
    }
    public ArrayList<Integer>getRedStations(){ return redStations;}
    public ArrayList<Integer>getBlueStations(){ return blueStations;}
    public ArrayList<Integer>getGreenStations(){ return greenStations;}
    public ArrayList<Integer>getPinkStations(){ return pinkStations;}
    public ArrayList<Integer>getBrownStations(){ return brownStations;}
    public ArrayList<Integer>getOrangeStations(){ return orangeStations;}

    public DataSource(){
        linesPool=new ArrayList();
        trainsPool=new ArrayList();
        setupLines();
        setupPhoto();
        purpleStations=new ArrayList();
        setupPurple();
        yellowStations=new ArrayList();
        setupYellow();
        redStations=new ArrayList();
        setupRed();
        blueStations=new ArrayList();
        setupBlue();
        greenStations=new ArrayList();
        setupGreen();
        pinkStations=new ArrayList();
        setupPink();
        brownStations=new ArrayList();
        setupBrown();
        orangeStations=new ArrayList();
        setupOrange();
    }
    private void setupPhoto(){
        trainsPool.add(R.drawable.train1);
        trainsPool.add(R.drawable.train2);
        trainsPool.add(R.drawable.train3);
        trainsPool.add(R.drawable.train4);
        trainsPool.add(R.drawable.train5);
        trainsPool.add(R.drawable.train6);
        trainsPool.add(R.drawable.train7);
        trainsPool.add(R.drawable.train8);
    }

    private void setupLines(){
        linesPool.add(R.string.line_1);
        linesPool.add(R.string.line_2);
        linesPool.add(R.string.line_3);
        linesPool.add(R.string.line_4);
        linesPool.add(R.string.line_5);
        linesPool.add(R.string.line_6);
        linesPool.add(R.string.line_7);
        linesPool.add(R.string.line_8);
    }
    private void setupPurple(){
        purpleStations.add(R.string.PUR1);
        purpleStations.add(R.string.PUR2);
        purpleStations.add(R.string.PUR3);
        purpleStations.add(R.string.PUR4);
        purpleStations.add(R.string.PUR5);
        purpleStations.add(R.string.PUR6);
        purpleStations.add(R.string.PUR7);
        purpleStations.add(R.string.PUR8);
        purpleStations.add(R.string.PUR9);
        purpleStations.add(R.string.PUR10);
        purpleStations.add(R.string.PUR11);
        purpleStations.add(R.string.PUR12);
        purpleStations.add(R.string.PUR13);
        purpleStations.add(R.string.PUR14);
        purpleStations.add(R.string.PUR15);
        purpleStations.add(R.string.PUR16);
        purpleStations.add(R.string.PUR17);
        purpleStations.add(R.string.PUR18);
        purpleStations.add(R.string.PUR19);
        purpleStations.add(R.string.PUR20);
        purpleStations.add(R.string.PUR21);
        purpleStations.add(R.string.PUR22);
        purpleStations.add(R.string.PUR23);
        purpleStations.add(R.string.PUR24);
        purpleStations.add(R.string.PUR25);
        purpleStations.add(R.string.PUR26);

    }
    private void setupYellow(){
    yellowStations.add(R.string.YEL1);
    yellowStations.add(R.string.YEL2);
    yellowStations.add(R.string.YEL3);
    }

    private void setupRed(){
        redStations.add(R.string.RED1);
        redStations.add(R.string.RED2);
        redStations.add(R.string.RED3);
        redStations.add(R.string.RED4);
        redStations.add(R.string.RED5);
        redStations.add(R.string.RED6);
        redStations.add(R.string.RED7);
        redStations.add(R.string.RED8);
        redStations.add(R.string.RED9);
        redStations.add(R.string.RED10);
        redStations.add(R.string.RED11);
        redStations.add(R.string.RED12);
        redStations.add(R.string.RED13);
        redStations.add(R.string.RED14);
        redStations.add(R.string.RED15);
        redStations.add(R.string.RED16);
        redStations.add(R.string.RED17);
        redStations.add(R.string.RED18);
        redStations.add(R.string.RED19);
        redStations.add(R.string.RED20);
        redStations.add(R.string.RED21);
        redStations.add(R.string.RED22);
        redStations.add(R.string.RED23);
        redStations.add(R.string.RED24);
        redStations.add(R.string.RED25);
        redStations.add(R.string.RED26);
        redStations.add(R.string.RED27);
        redStations.add(R.string.RED28);
        redStations.add(R.string.RED29);
        redStations.add(R.string.RED30);
        redStations.add(R.string.RED31);

    }
    private void setupBlue(){
        blueStations.add(R.string.BLUE1);
        blueStations.add(R.string.BLUE2);
        blueStations.add(R.string.BLUE3);
        blueStations.add(R.string.BLUE4);
        blueStations.add(R.string.BLUE5);
        blueStations.add(R.string.BLUE6);
        blueStations.add(R.string.BLUE7);
        blueStations.add(R.string.BLUE8);
        blueStations.add(R.string.BLUE9);
        blueStations.add(R.string.BLUE10);
        blueStations.add(R.string.BLUE11);
        blueStations.add(R.string.BLUE12);
        blueStations.add(R.string.BLUE13);
        blueStations.add(R.string.BLUE14);
        blueStations.add(R.string.BLUE15);
        blueStations.add(R.string.BLUE16);
        blueStations.add(R.string.BLUE17);
        blueStations.add(R.string.BLUE18);
        blueStations.add(R.string.BLUE19);
        blueStations.add(R.string.BLUE20);
        blueStations.add(R.string.BLUE21);
        blueStations.add(R.string.BLUE22);
        blueStations.add(R.string.BLUE23);
        blueStations.add(R.string.BLUE24);
        blueStations.add(R.string.BLUE25);
        blueStations.add(R.string.BLUE26);
        blueStations.add(R.string.BLUE27);
        blueStations.add(R.string.BLUE28);
        blueStations.add(R.string.BLUE29);
        blueStations.add(R.string.BLUE30);
        blueStations.add(R.string.BLUE31);
        blueStations.add(R.string.BLUE32);
        blueStations.add(R.string.BLUE33);

    }
    private void setupGreen(){
        greenStations.add(R.string.GREEN1);
        greenStations.add(R.string.GREEN2);
        greenStations.add(R.string.GREEN3);
        greenStations.add(R.string.GREEN4);
        greenStations.add(R.string.GREEN5);
        greenStations.add(R.string.GREEN6);
        greenStations.add(R.string.GREEN7);
        greenStations.add(R.string.GREEN8);
        greenStations.add(R.string.GREEN9);
        greenStations.add(R.string.GREEN10);
        greenStations.add(R.string.GREEN11);
        greenStations.add(R.string.GREEN12);
        greenStations.add(R.string.GREEN13);
        greenStations.add(R.string.GREEN14);
        greenStations.add(R.string.GREEN15);
        greenStations.add(R.string.GREEN16);
        greenStations.add(R.string.GREEN17);
        greenStations.add(R.string.GREEN18);
        greenStations.add(R.string.GREEN19);
        greenStations.add(R.string.GREEN20);
        greenStations.add(R.string.GREEN21);
        greenStations.add(R.string.GREEN22);
        greenStations.add(R.string.GREEN23);
        greenStations.add(R.string.GREEN24);
        greenStations.add(R.string.GREEN25);
        greenStations.add(R.string.GREEN26);
        greenStations.add(R.string.GREEN27);
        greenStations.add(R.string.GREEN28);
        greenStations.add(R.string.GREEN29);
        greenStations.add(R.string.GREEN30);
    }
    private void setupPink(){
        pinkStations.add(R.string.PINK1);
        pinkStations.add(R.string.PINK2);
        pinkStations.add(R.string.PINK3);
        pinkStations.add(R.string.PINK4);
        pinkStations.add(R.string.PINK5);
        pinkStations.add(R.string.PINK6);
        pinkStations.add(R.string.PINK7);
        pinkStations.add(R.string.PINK8);
        pinkStations.add(R.string.PINK9);
        pinkStations.add(R.string.PINK10);
        pinkStations.add(R.string.PINK11);
        pinkStations.add(R.string.PINK12);
        pinkStations.add(R.string.PINK13);
        pinkStations.add(R.string.PINK14);
        pinkStations.add(R.string.PINK15);
        pinkStations.add(R.string.PINK16);
        pinkStations.add(R.string.PINK17);
        pinkStations.add(R.string.PINK18);
        pinkStations.add(R.string.PINK19);
        pinkStations.add(R.string.PINK20);
        pinkStations.add(R.string.PINK21);
    }
    private void setupBrown(){
        brownStations.add(R.string.BROWN1);
        brownStations.add(R.string.BROWN2);
        brownStations.add(R.string.BROWN3);
        brownStations.add(R.string.BROWN4);
        brownStations.add(R.string.BROWN5);
        brownStations.add(R.string.BROWN6);
        brownStations.add(R.string.BROWN7);
        brownStations.add(R.string.BROWN8);
        brownStations.add(R.string.BROWN9);
        brownStations.add(R.string.BROWN10);
        brownStations.add(R.string.BROWN11);
        brownStations.add(R.string.BROWN12);
        brownStations.add(R.string.BROWN13);
        brownStations.add(R.string.BROWN14);
        brownStations.add(R.string.BROWN15);
        brownStations.add(R.string.BROWN16);
        brownStations.add(R.string.BROWN17);
        brownStations.add(R.string.BROWN18);
        brownStations.add(R.string.BROWN19);
        brownStations.add(R.string.BROWN20);
        brownStations.add(R.string.BROWN21);
        brownStations.add(R.string.BROWN22);
        brownStations.add(R.string.BROWN23);
        brownStations.add(R.string.BROWN24);
        brownStations.add(R.string.BROWN25);
        brownStations.add(R.string.BROWN26);
        brownStations.add(R.string.BROWN27);
    }
    private void setupOrange(){
        orangeStations.add(R.string.ORANGE1);
        orangeStations.add(R.string.ORANGE2);
        orangeStations.add(R.string.ORANGE3);
        orangeStations.add(R.string.ORANGE4);
        orangeStations.add(R.string.ORANGE5);
        orangeStations.add(R.string.ORANGE6);
        orangeStations.add(R.string.ORANGE7);
        orangeStations.add(R.string.ORANGE8);
        orangeStations.add(R.string.ORANGE9);
        orangeStations.add(R.string.ORANGE10);
        orangeStations.add(R.string.ORANGE11);
        orangeStations.add(R.string.ORANGE12);
        orangeStations.add(R.string.ORANGE13);
        orangeStations.add(R.string.ORANGE14);
        orangeStations.add(R.string.ORANGE15);

    }


    public int getDataSource1Length() {
        return linesPool.size();
    }
    public int getDataSourcePURLength(){
        return purpleStations.size();
    }
    public int getDataSourceYELLength(){
        return yellowStations.size();
    }
    public int getDataSourceREDLength() {return redStations.size();}
    public int getDataSourceBLUELength() {return blueStations.size();}
    public int getDataSourceGREENLength() {return greenStations.size();}
    public int getDataSourcePINKLength() {return pinkStations.size();}
    public int getDataSourceORANGELength() {return orangeStations.size();}
    public int getDataSourceBROWNLength() {return brownStations.size();}


}
