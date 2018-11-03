package systemi;

import java.io.IOException;
import java.sql.SQLException;

/**
 * 名称：Skha002B1
 * 説明：保全計画取込受信を起動する。
 * 作成者：
 * 作成日：2018/10/10
 * 最終更新者：
 * 最終更新日：2018/10/19
 * 変更履歴
 *     2018/10/19 崔向東  新規作成
 */

// 保全計画取込受信のmain実行クラス
public class Skha002B1 extends PFOReceiveCommon{

    // 販売計画(中長期予算)受信main
    public static void main(String[] args) {
        System.out.println("保全計画取込受信バッチ  main実装 Start");
        // 保全計画取込受信起動クラスのインスタンスを生成する
        Skha002B1Start obj = new Skha002B1Start();
        // 保全計画取込受信起動クラスの受信共通実行メソッドを呼び出す（引数：なし）
        obj.start();
    }
}

/**
 * 名称：Skha002B1Start
 * 説明：保全計画取込受信を処理する。
 *     受信処理共通メソッドを呼び出し、受信共通処理を実行する。
 * 作成者：
 * 作成日：2018/10/10
 * 最終更新者：
 * 最終更新日：2018/10/19
 * 変更履歴
 *     2018/10/19   新規作成
 */

// 保全計画取込受信起動クラス
class Skha002B1Start extends PFOReceiveCommon {

    // 受信共通実行メソッド
    public void start() {
        // 引数配列作成
        String[] str = { "SKHA002B1","","","" };
        try {
            // 受信処理共通メソッドを呼び出し、受信共通処理を実行する。（引数：バッチID）
            super.exec(str);
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 名称：edit
     * 説明：個別編集処理メソッド。
     *     オーバーライドを実行する。
     * 戻り値：inData  編集元データ
     * 引数：inData  編集元データ
     */

    @Override
    // 個別編集処理メソッド
    public String[][] edit(String[][] inData) {

        return inData;
    }

    /**
     * 名称：createCheckParam
     * 説明：個別入力/相関チェック用パラメータ作成処理メソッド。
     *     オーバーライドを実行する。
     * 戻り値：iCheckParam  チェック用パラメータ
     * 引数：なし
     */

    @Override
    // 個別入力/相関チェック用パラメータ作成処理メソッド ---オーバーライドが必要。
    public String[][] createCheckParam() {

        // 相関チェック用パラメータ初期化
        String[][] iCheckParam = new String[11][8];

        return iCheckParam;
    }
}
