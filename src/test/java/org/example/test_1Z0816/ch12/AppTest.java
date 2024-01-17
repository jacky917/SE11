package org.example.test_1Z0816.ch12;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    /**
     * 🌟🌟
     * 創建日期：2023/12/21
     * 最後一次查看：2023/12/21
     * 題目考點：整数オーバーフォロー攻撃に対応　整數溢位攻擊對策
     * 需要補足知識：日文
     * 複習：查看總結
     * 總結：
     * 1.事前条件テストを行う　⭕
     * 2.BigIntegerクラスを使う　⭕
     * 3.アップキャストを行う　向上轉型　⭕
     * 1.ダウンキャストを行う　向下轉型　❌
     */
    public void test_q03() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/12/21
     * 最後一次查看：2023/12/21
     * 題目考點：機密情報の扱いに関する
     * 需要補足知識：日文
     * 複習：查看總結
     * 總結：
     * 1.例外が発生したとき、どのような例外が発生したのかをユーザーに見せてはいけない。⭕
     * 2.デバッグに使用したログは、審査のときに必要になるので保存しておかなければならない。❌
     * 3.機密情報を扱ったインスタンスは、ガベージコレクションを待たずに、速やかに削除しなければならない。⭕
     * 4.コアダンプは、できるだけ早期に削除すべきある。⭕
     * ---------
     * コアダンプ（core dump）とは、実行中のプログラムがエラーで強制終了する際に、
     * その時点でプログラムが使用しているメモリ空間の内容をまるごと写し取ってファイルに保存したもの。
     */
    public void test_q04() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/12/21
     * 最後一次查看：2023/12/21
     * 題目考點：安全
     * 需要補足知識：-
     * 複習：查看 o01
     * 總結：
     * 1.SecurityManager 並不是默認開啟的
     * 2.Policy（策略） 是 Permission（權限）的集合
     */
    public void test_q06() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/12/21
     * 最後一次查看：2023/12/21
     * 題目考點：不変オブジェクトを定義する際に、セキュリティ面で適切な方法
     * 需要補足知識：日文
     * 複習：查看總結
     * 總結：
     * 1.フィールドの値を変更するようなsetterメソッドは提供しない。⭕
     * 2.フィールドの値を変更するのであれば、ディープコビーしたインスタンスを生成して、その参照を戻す。⭕
     * 3.フォールドはfinalで宣言し、コンストラクタで初期値を設定しらた変更できないようにする。⭕
     * 4.継承ができないように、クラス宣言をfinalで修飾する。⭕
     * 5.インスタンスを生成するための専用のビルダーを用意する。⭕
     * 引数なしのpublicなコンストラクタを用意する。❌
     */
    public void test_q08() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/12/21
     * 最後一次查看：2023/12/21
     * 題目考點：可変オブジェクトを安全に扱うための指針
     * 需要補足知識：日文
     * 複習：查看總結
     * 總結：
     * 1.getterメソッドでは、フィールドのオブジェクトをコピーを作って戻す。⭕
     * 2.コピーコンストラクタを用意する。⭕
     * 3.可変オブジェクトを受け取るコントラクタでは、受け取った参照をそのまま利用しない。⭕
     * フィールドをprivateで修飾し、アクセサメソッドを提供する。❌
     */
    public void test_q09() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/12/21
     * 最後一次查看：2023/12/21
     * 題目考點：セキュアコーディングを実践するためも方法
     * 需要補足知識：
     * 複習：
     * 總結：
     * 1.パッケージ内で公開するインタフェースを限定する。⭕
     * 2.モジュールを使って公開パッケージを限定する。⭕
     * 3.クラスを宣言するときにfinalで修飾。⭕
     * 原則的に、クラスはprotectedで宣言する。❌
     */
    public void test_q10() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/12/21
     * 最後一次查看：2023/12/21
     * 題目考點：シリアライズ・プロキシ・パターン　序列化代理模式
     * 需要補足知識：日文
     * 複習：詳細查看 o01
     * 總結：writeReplace 和 readResolve 專注於替換序列化或反序列化的物件。
     */
    public void test_q13() {
    }

    /**
     * 🌟🌟🌟
     * 創建日期：2023/12/21
     * 最後一次查看：2023/12/21
     * 題目考點：
     * 需要補足知識：
     * 複習：
     * 總結：
     */
    public void test_sample() {
    }

}






