package systemi;

import java.io.IOException;
import java.sql.SQLException;

//製造時、エラーが出ない為、作りました。---Abstractとしてもいいじゃない？？
//お客からのPGMを入れ替える。
//受信共通クラス
public class PFOReceiveCommon {
    String menuID = "";
    String callClassName ="";
    String serchFilePath = "";
    String serchFileName = "";
    String logMessage ="";

    public PFOReceiveCommon(){}

    //受信共通処理メソッド
    public boolean exec(String[] args) throws SQLException,IOException{
        this.menuID = args[0];
        this.callClassName = args[1];
        this.serchFilePath = args[2];
        this.serchFileName = args[3];
        return false;
    }

    //個別編集処理メソッド    ---オーバーライドが必要。
    public String[][] edit(String[][] inData){

        return inData;
    }
    //個別入力/相関チェック用パラメータ作成処理メソッド   ---オーバーライドが必要。
    public String[][] createCheckParam(){
        return null;
    }
}
