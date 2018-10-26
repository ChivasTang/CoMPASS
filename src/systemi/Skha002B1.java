package systemi;

import java.io.IOException;
import java.sql.SQLException;

import systemi.PFOReceiveCommon;

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
public class Skha002B1 extends PFOReceiveCommon {

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
        String[] str = { "SKHA002B1" };
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
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 8; j++) {
                iCheckParam[i][j] = "";
            }
        }

        // 空文字チェック
        // "1"：チェック対象、""（空白）：チェック対象外
        iCheckParam[0][0] = "1"; // 工場コード
        iCheckParam[0][1] = "1"; // 設備コード
        iCheckParam[0][2] = "1"; // 定修年月
        iCheckParam[0][3] = "1"; // 開始日時
        iCheckParam[0][4] = "1"; // 終了日時
        iCheckParam[0][5] = "1"; // 定期修理区分

        // 文字種チェック
        // "A"：英数字、"D"：日付、"N"：数値文字、""（空白）：チェック対象外
        iCheckParam[1][0] = "A"; // 工場コード
        iCheckParam[1][1] = "A"; // 設備コード
        iCheckParam[1][2] = "D"; // 定修年月
        iCheckParam[1][3] = "D"; // 開始日時
        iCheckParam[1][4] = "D"; // 終了日時
        iCheckParam[1][5] = "A"; // 定期修理区分

        // 桁数チェック
        // （数値）：文字列、"N"：数値文字、""（空白）：チェック対象外
        iCheckParam[4][0] = "25"; // 工場コード
        iCheckParam[4][1] = "25"; // 設備コード
        iCheckParam[4][5] = "25"; // 定期修理区分
        iCheckParam[4][6] = "50"; // 定期修理区分名称
        iCheckParam[4][7] = "50"; // 備考

        // 日付チェック ""（空白）：チェック対象外
        iCheckParam[5][2] = "yyyyMM"; // 定修年月
        iCheckParam[5][3] = "yyyyMMddHHmm"; // 開始日時
        iCheckParam[5][4] = "yyyyMMddHHmm"; // 終了日時

        // 相関チェック
        // "01"～"14"：チェック対象（マスタ種別）、""（空白）：チェック対象外
        // ???質問:"23"、"24"がチェック対象かどうか確認中
        iCheckParam[9][0] = "23"; // 工場コード
        iCheckParam[9][1] = "24"; // 設備コード

        return iCheckParam;
    }
}
