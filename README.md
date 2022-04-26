# [ByteLegend](https://bytelegend.com) Challenge of JavaIsland: OOP, Polymorphism

<details open='true'>
<summary>English</summary>

## Interface and Abstract Class in Action

Please refactor the classes `Car`/`Cat`/`Fish`/`Plane`/`Bird`/`Butterfly` in [src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java) with interfaces and abstract classes.
Don't change the functionality of the classes. Understand the role of interfaces and abstract classes.

After refactoring, please try to simplify these messy method `everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`, and appreciate the benefits of polymorphism.


The required class hierarchy is shown as follows.
The circle I represents an interface, the solid circle C represents a class, the semi-hollow circle C represents an abstract class,
the green dotted line represents implementing an interface, the green solid line represents inheriting from a parent class.

![uml](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

- You can accomplish this challenge via any way below:
  - Recommended for beginners: run `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action` to download the code,
    finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
    - If you don't know how, you can click [import project into IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md)/[import project into VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md).
    - Before submitting your code, you'd better run `mvn verify` locally to save time. Don't know how? See [verify locally in IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md)/[verify locally in VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md).
  - Very unrecommended: you can [click here to download zipped code](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main) if you don't like `git` operations.
  - Or: if you are confident enough to write code in web editor directly, go ahead.
  - Or: if you are familiar with GitHub, you can fork [the repo](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action), finish the challenge and create a pull request.
- The bot will check your PR and tell you if you accomplish the challenge.
- Go back to [ByteLegend](https://bytelegend.com) and continue your hero journey.

Good luck!

If you need any help, feel free to join the [Discord Community](https://discord.gg/35RreUUGWt) or contact us via [contact@bytelegend.com](mailto:contact@bytelegend.com).

**Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:**

- `src/main/java/com/bytelegend/World.java`

</details>

<details>
<summary>简体中文</summary>

## 接口与抽象类实战

请使用接口和抽象类重构[src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java)中的`Car`/`Cat`/`Fish`/`Plane`/`Bird`/`Butterfly`类，不改变其功能，体会接口和抽象类的作用。

在完成重构后，请尝试简化啰嗦的`everyFlyableObjectFly()`/`everySoundMakerMakeSound()`/`everyAnimalBreath()`方法，体会多态的好处。


要求的继承体系如图所示。其中，圆圈I代表接口，实心圆圈C代表类，半空心圆圈C代表抽象类，绿色虚线代表实现接口，绿色实现代表继承父类。

![uml](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

- 你可以使用以下任意一种方法完成挑战：
  - 初学者推荐：运行`git clone https://git.bytelegend.com/ByteLegendQuest/java-interface-abstract-class-in-action`将代码下载到本地，在本地使用IDE调试完成后复制到网页编辑器里提交。
    - 如果你不知道怎么做，可以点击[导入IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/zh_hans/clone-and-import.md)/[导入VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/zh_hans/clone-and-import-vscode.md)。
    - 在提交之前，你最好先在本地运行`mvn verify`验证一下答案，以节约时间。不知道如何做？请查看[在IDEA中本地验证](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/zh_hans/run-mvn-verify-idea.md)/[在VSCode中本地验证](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/zh_hans/run-mvn-verify-vscode.md)。
  - 非常不推荐：如果你实在不喜欢`git`命令行操作，你可以[点击这里直接下载打包好的代码](https://ghcodeload.bytelegend.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main)。
  - 或者：如果你非常自信不需要下载代码到本地调试，可以使用网页编辑器直接提交。
  - 或者：如果你对GitHub非常熟悉，你可以fork[这个仓库](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action)、完成挑战后，创建一个Pull Request。
- 机器人将会检查你的答案，告诉你你是否通过了挑战。
- 回到[字节传说](https://bytelegend.com)，然后继续你的英雄旅程。

祝你好运！

如果你需要任何帮助，欢迎加入官方玩家QQ群（在[首页](https://bytelegend.com)右下角的`联系 & 关于`菜单里可以找到入群方式）或者[Discord社区](https://discord.gg/PvmqK3hF)，或email至[contact@bytelegend.com](mailto:contact@bytelegend.com)。

**注意：我们只允许您修改以下文件，任何对其他文件的修改都会被拒绝：**

- `src/main/java/com/bytelegend/World.java`

</details>

<details>
<summary>繁體中文</summary>

接口和抽像類在行動
---------

請使用接口和抽像類重構[src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java)中的`Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly`類。不要更改類的功能。了解接口和抽像類的作用。

重構之後，請盡量簡化這些亂七八糟的方法`everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` ，體會多態的好處。

所需的類層次結構如下所示。圓圈I代表接口，實心圓C代表類，半空心圓C代表抽像類，綠色虛線代表實現接口，綠色實線代表從父類繼承。

![微升](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   您可以通過以下任何方式完成此挑戰：
    -   推薦給初學者：運行`git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action`下載代碼，在本地IDE中完成挑戰，然後復制/粘貼/提交答案網頁編輯器。
        -   如果你不知道怎麼做，你可以點擊[import project into IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md) 。
        -   在提交代碼之前，您最好在本地運行`mvn verify`以節省時間。不知道怎麼樣？請參閱[在 IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md) [中進行本地驗證/在 VSCode 中進行本地驗證](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md)。
    -   非常不推薦：如果你不喜歡`git`操作，可以[點擊這裡下載壓縮代碼](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main)。
    -   或者：如果您有足夠的信心直接在 Web 編輯器中編寫代碼，請繼續。
    -   或者：如果你熟悉 GitHub，你可以 fork [倉庫](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action)，完成挑戰並創建一個拉取請求。
-   機器人會檢查你的 PR 並告訴你是否完成了挑戰。
-   回到[ByteLegend](https://bytelegend.com)繼續你的英雄之旅。

祝你好運！

如果您需要任何幫助，請隨時加入[Discord 社區](https://discord.gg/35RreUUGWt)或通過[contact@bytelegend.com](mailto:contact@bytelegend.com)聯繫我們。

**注意：我們只允許您修改以下文件。對以下文件以外的文件的任何更改都將被拒絕：**

-   `src/main/java/com/bytelegend/World.java`
</details>

<details>
<summary>Español</summary>

Interfaz y clase abstracta en acción
------------------------------------

Refactorice las clases `Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly` en [src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java) con interfaces y clases abstractas. No cambie la funcionalidad de las clases. Comprender el papel de las interfaces y las clases abstractas.

Después de la refactorización, intente simplificar estos métodos complicados `everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` , y aprecie los beneficios del polimorfismo.

La jerarquía de clases requerida se muestra a continuación. El círculo I representa una interfaz, el círculo sólido C representa una clase, el círculo semihueco C representa una clase abstracta, la línea punteada verde representa la implementación de una interfaz, la línea sólida verde representa la herencia de una clase principal.

![uml](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   Puede lograr este desafío de cualquier manera a continuación:
    -   Recomendado para principiantes: ejecute `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action` para descargar el código, finalice el desafío en su IDE local, luego copie/pegue/envíe la respuesta en Editor web.
        -   Si no sabe cómo hacerlo, puede hacer clic en [importar proyecto a IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md) / [importar proyecto a VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar su código, es mejor que ejecute `mvn verify` localmente para ahorrar tiempo. ¿No sabes cómo? Ver [verificar localmente en IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente en VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muy poco recomendado: puede [hacer clic aquí para descargar el código comprimido](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main) si no le gustan las operaciones de `git` .
    -   O: si tiene la confianza suficiente para escribir código en el editor web directamente, adelante.
    -   O: si está familiarizado con GitHub, puede bifurcar [el repositorio](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action) , finalizar el desafío y crear una solicitud de extracción.
-   El bot verificará tu PR y te dirá si logras el desafío.
-   Regrese a [ByteLegend](https://bytelegend.com) y continúe su viaje de héroe.

¡Buena suerte!

Si necesita ayuda, no dude en unirse a la [comunidad de Discord](https://discord.gg/35RreUUGWt) o contáctenos a través de [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: solo le permitimos modificar los siguientes archivos. Cualquier cambio en los archivos que no sean los siguientes archivos será rechazado:**

-   `src/main/java/com/bytelegend/World.java`
</details>

<details>
<summary>العربية</summary>

واجهة ودرجة الملخص في العمل
---------------------------

يرجى إعادة بناء الفئات `Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly` في [src / main / java / com / bytelegend / World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java) باستخدام واجهات وفصول مجردة. لا تغير وظائف الفئات. فهم دور الواجهات والفئات المجردة.

بعد إعادة البناء ، يرجى محاولة تبسيط هذه الطريقة الفوضوية `everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` وتقدير فوائد تعدد الأشكال.

يتم عرض التسلسل الهرمي المطلوب للفئة على النحو التالي. تمثل الدائرة I واجهة ، وتمثل الدائرة الصلبة C فئة ، وتمثل الدائرة شبه المجوفة C فئة مجردة ، ويمثل الخط المنقط الأخضر تنفيذ واجهة ، ويمثل الخط الصلب الأخضر الموروث من فئة أصل.

![uml](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   يمكنك إنجاز هذا التحدي بأي طريقة أدناه:
    -   موصى به للمبتدئين: قم بتشغيل `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action` لتنزيل الكود ، وإنهاء التحدي في IDE المحلي الخاص بك ، ثم نسخ / لصق / إرسال الإجابة في محررشبكة.
        -   إذا كنت لا تعرف كيف يمكنك النقر فوق [استيراد مشروع إلى IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md) / [استيراد مشروع إلى VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md) .
        -   قبل إرسال التعليمات البرمجية الخاصة بك ، من الأفضل تشغيل `mvn verify` محليًا لتوفير الوقت. لا أعرف كيف؟ انظر [التحقق محليًا في IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md) / [تحقق محليًا في VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   غير موصى به على الإطلاق: يمكنك [النقر هنا لتنزيل رمز مضغوط](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main) إذا كنت لا تحب عمليات `git` .
    -   أو: إذا كنت واثقًا بدرجة كافية لكتابة التعليمات البرمجية في محرر الويب مباشرةً ، فابدأ.
    -   أو: إذا كنت معتادًا على GitHub ، فيمكنك تفرع [الريبو](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action) وإنهاء التحدي وإنشاء طلب سحب.
-   سيتحقق الروبوت من العلاقات العامة الخاصة بك ويخبرك إذا أنجزت التحدي.
-   ارجع إلى [ByteLegend وتابع](https://bytelegend.com) رحلة بطلك.

حظا طيبا وفقك الله!

إذا كنت بحاجة إلى أي مساعدة ، فلا تتردد في الانضمام إلى [مجتمع Discord](https://discord.gg/35RreUUGWt) أو الاتصال بنا عبر [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**ملاحظة: نسمح لك فقط بتعديل الملفات التالية. سيتم رفض أي تغييرات يتم إجراؤها على الملفات بخلاف الملفات التالية:**

-   `src/main/java/com/bytelegend/World.java`
</details>

<details>
<summary>Português</summary>

Interface e classe abstrata em ação
-----------------------------------

Por favor refatore as classes `Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly` em [src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java) com interfaces e classes abstratas. Não altere a funcionalidade das classes. Compreender o papel das interfaces e classes abstratas.

Após a refatoração, tente simplificar esses métodos `everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` e aprecie os benefícios do polimorfismo.

A hierarquia de classe necessária é mostrada a seguir. O círculo I representa uma interface, o círculo sólido C representa uma classe, o círculo semi-oco C representa uma classe abstrata, a linha pontilhada verde representa a implementação de uma interface, a linha sólida verde representa a herança de uma classe pai.

![uml](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   Você pode realizar este desafio de qualquer maneira abaixo:
    -   Recomendado para iniciantes: execute `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action` para baixar o código, conclua o desafio em seu IDE local e copie/cole/envie a resposta em editor web.
        -   Se você não sabe como, você pode clicar em [import project into IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar seu código, é melhor você executar `mvn verify` localmente para economizar tempo. Não sei como? Consulte [verificar localmente em IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente em VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muito não recomendado: você pode [clicar aqui para baixar o código zipado](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main) se não gostar das operações do `git` .
    -   Ou: se você estiver confiante o suficiente para escrever código diretamente no editor da web, vá em frente.
    -   Ou: se você estiver familiarizado com o GitHub, você pode bifurcar [o repo](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action) , finalizar o desafio e criar um pull request.
-   O bot verificará seu PR e informará se você cumprir o desafio.
-   Volte para [ByteLegend](https://bytelegend.com) e continue sua jornada de herói.

Boa sorte!

Se precisar de ajuda, sinta-se à vontade para se juntar à [Comunidade Discord](https://discord.gg/35RreUUGWt) ou entre em contato conosco via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: só permitimos que você modifique os seguintes arquivos. Quaisquer alterações em arquivos que não sejam os arquivos a seguir serão rejeitadas:**

-   `src/main/java/com/bytelegend/World.java`
</details>

<details>
<summary>Bahasa Indonesia</summary>

Antarmuka dan Kelas Abstrak dalam Tindakan
------------------------------------------

Harap perbaiki kelas `Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly` -kupu di [src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java) dengan antarmuka dan kelas abstrak. Jangan ubah fungsionalitas kelas. Memahami peran antarmuka dan kelas abstrak.

Setelah pemfaktoran ulang, coba sederhanakan metode berantakan ini `everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` , dan hargai manfaat polimorfisme.

Hirarki kelas yang diperlukan ditunjukkan sebagai berikut. Lingkaran I mewakili antarmuka, lingkaran padat C mewakili kelas, lingkaran setengah berongga C mewakili kelas abstrak, garis putus-putus hijau mewakili implementasi antarmuka, garis hijau solid mewakili pewarisan dari kelas induk.

![uml](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   Anda dapat menyelesaikan tantangan ini melalui cara apa pun di bawah ini:
    -   Direkomendasikan untuk pemula: jalankan `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action` untuk mengunduh kode, selesaikan tantangan di IDE lokal Anda, lalu salin/tempel/kirim jawabannya di editor web.
        -   Jika Anda tidak tahu caranya, Anda bisa mengklik [import project into IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Sebelum mengirimkan kode Anda, Anda sebaiknya menjalankan `mvn verify` secara lokal untuk menghemat waktu. Tidak tahu bagaimana? Lihat [verifikasi secara lokal di IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md) / [verifikasi secara lokal di VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sangat tidak direkomendasikan: Anda dapat [mengklik di sini untuk mengunduh kode zip](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main) jika Anda tidak menyukai operasi `git` .
    -   Atau: jika Anda cukup percaya diri untuk menulis kode di editor web secara langsung, silakan.
    -   Atau: jika Anda terbiasa dengan GitHub, Anda dapat melakukan fork [repo](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action) , menyelesaikan tantangan, dan membuat permintaan tarik.
-   Bot akan memeriksa PR Anda dan memberi tahu Anda jika Anda menyelesaikan tantangan.
-   Kembali ke [ByteLegend](https://bytelegend.com) dan lanjutkan perjalanan pahlawan Anda.

Semoga berhasil!

Jika Anda memerlukan bantuan, jangan ragu untuk bergabung dengan [Komunitas Discord](https://discord.gg/35RreUUGWt) atau hubungi kami melalui [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Catatan: kami hanya mengizinkan Anda untuk mengubah file berikut. Setiap perubahan pada file selain file berikut akan ditolak:**

-   `src/main/java/com/bytelegend/World.java`
</details>

<details>
<summary>Français</summary>

Interface et classe abstraite en action
---------------------------------------

Veuillez refactoriser les classes `Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly` dans [src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java) avec des interfaces et des classes abstraites. Ne modifiez pas la fonctionnalité des classes. Comprendre le rôle des interfaces et des classes abstraites.

Après la refactorisation, essayez de simplifier ces méthodes désordonnées `everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` , et appréciez les avantages du polymorphisme.

La hiérarchie de classes requise est illustrée ci-dessous. Le cercle I représente une interface, le cercle plein C représente une classe, le cercle semi-creux C représente une classe abstraite, le trait pointillé vert représente l'implémentation d'une interface, le trait plein vert représente l'héritage d'une classe mère.

![uml](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   Vous pouvez accomplir ce défi de n'importe quelle manière ci-dessous:
    -   Recommandé pour les débutants : lancez `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action` pour télécharger le code, terminez le défi dans votre IDE local, puis copiez/collez/soumettez la réponse dans éditeur web.
        -   Si vous ne savez pas comment, vous pouvez cliquer sur [importer le projet dans IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md) / [importer le projet dans VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Avant de soumettre votre code, vous feriez mieux d'exécuter `mvn verify` localement pour gagner du temps. Vous ne savez pas comment ? Voir [vérifier localement dans IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md) / [vérifier localement dans VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Très déconseillé : vous pouvez [cliquer ici pour télécharger le code compressé](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main) si vous n'aimez pas les opérations `git` .
    -   Ou : si vous êtes suffisamment confiant pour écrire du code directement dans l'éditeur Web, continuez.
    -   Ou : si vous êtes familier avec GitHub, vous pouvez forker [le dépôt](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action) , terminer le défi et créer une demande d'extraction.
-   Le bot vérifiera votre PR et vous dira si vous accomplissez le défi.
-   Retournez à [ByteLegend](https://bytelegend.com) et continuez votre voyage de héros.

Bonne chance!

Si vous avez besoin d'aide, n'hésitez pas à rejoindre la [communauté Discord](https://discord.gg/35RreUUGWt) ou à nous contacter via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Remarque : nous vous autorisons uniquement à modifier les fichiers suivants. Toute modification de fichiers autres que les fichiers suivants sera rejetée :**

-   `src/main/java/com/bytelegend/World.java`
</details>

<details>
<summary>日本語</summary>

動作中のインターフェースと抽象クラス
------------------

インターフェイスと抽象クラスを使用して、 [src / main / java / com / bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java)のクラス`Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly`をリファクタリングしてください。クラスの機能を変更しないでください。インターフェイスと抽象クラスの役割を理解します。

リファクタリング後、これらの厄介なメソッド`everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` （）を単純化して、ポリモーフィズムの利点を理解してください。

必要なクラス階層は次のとおりです。円Iはインターフェースを表し、実線の円Cはクラスを表し、半中空の円Cは抽象クラスを表し、緑色の点線はインターフェースの実装を表し、緑色の実線は親クラスからの継承を表します。

![uml](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   この課題は、以下のいずれかの方法で達成できます。
    -   初心者に推奨： `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action`を実行してコードをダウンロードし、ローカルIDEでチャレンジを終了してから、で回答をコピー/貼り付け/送信します。 Webエディター。
        -   方法がわからない場合は、\[ [プロジェクトをIDEAにインポート](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md)\]/\[ [プロジェクトをVSCodeにインポート](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md)\]をクリックできます。
        -   コードを送信する前に、時間を節約するためにローカルで`mvn verify`実行することをお勧めします。方法がわかりませんか？ [IDEAでローカルに](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md)[検証する/VSCodeでローカルに](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md)検証するを参照してください。
    -   非常に推奨されていません`git`操作が気に入らない場合は、 [ここをクリックしてzipコードをダウンロード](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main)できます。
    -   または：Webエディターで直接コードを記述できる自信がある場合は、先に進んでください。
    -   または：GitHubに精通している場合は[、リポジトリ](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action)をフォークしてチャレンジを終了し、プルリクエストを作成できます。
-   ボットはPRをチェックし、チャレンジを達成したかどうかを通知します。
-   [ByteLegend](https://bytelegend.com)に戻り、ヒーローの旅を続けてください。

幸運を！

ヘルプが必要な場合は、 [Discordコミュニティ](https://discord.gg/35RreUUGWt)に参加するか、contact [@bytelegend.com](mailto:contact@bytelegend.com)からお問い合わせください。

**注：変更できるのは次のファイルのみです。次のファイル以外のファイルへの変更は拒否されます。**

-   `src/main/java/com/bytelegend/World.java`
</details>

<details>
<summary>Русский</summary>

Интерфейс и абстрактный класс в действии
----------------------------------------

Пожалуйста, рефакторинг классов `Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly` в [src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java) с интерфейсами и абстрактными классами. Не изменяйте функциональность классов. Понимать роль интерфейсов и абстрактных классов.

После рефакторинга попробуйте упростить эти запутанные методы `everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` и оцените преимущества полиморфизма.

Требуемая иерархия классов показана ниже. Круг I представляет интерфейс, сплошной круг C представляет класс, полупустой круг C представляет абстрактный класс, зеленая пунктирная линия представляет реализацию интерфейса, зеленая сплошная линия представляет наследование от родительского класса.

![умл](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   Вы можете выполнить эту задачу любым способом, указанным ниже:
    -   Рекомендуется для начинающих: запустите `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action` , чтобы загрузить код, выполните задание в локальной среде IDE, затем скопируйте/вставьте/отправьте ответ в веб-редактор.
        -   Если вы не знаете как, вы можете нажать [импортировать проект в IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md) / [импортировать проект в VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Перед отправкой кода вам лучше запустить `mvn verify` локально, чтобы сэкономить время. Не знаете как? См. « [Проверить локально в IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md) / [проверить локально в VSCode»](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Крайне не рекомендуется: вы можете [нажать здесь, чтобы загрузить заархивированный код](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main) , если вам не нравятся операции `git` .
    -   Или: если вы достаточно уверены, чтобы писать код напрямую в веб-редакторе, вперед.
    -   Или: если вы знакомы с GitHub, вы можете разветвить [репозиторий](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action) , выполнить задание и создать запрос на включение.
-   Бот проверит ваш PR и сообщит, выполнили ли вы задание.
-   Вернитесь в [ByteLegend](https://bytelegend.com) и продолжайте свое героическое путешествие.

Удачи!

Если вам нужна помощь, присоединяйтесь к [сообществу Discord](https://discord.gg/35RreUUGWt) или свяжитесь с нами по [адресу contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Примечание: мы разрешаем вам изменять только следующие файлы. Любые изменения в файлах, кроме следующих файлов, будут отклонены:**

-   `src/main/java/com/bytelegend/World.java`
</details>

<details>
<summary>Deutsch</summary>

Schnittstelle und abstrakte Klasse in Aktion
--------------------------------------------

Bitte überarbeiten Sie die Klassen `Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly` in [src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java) mit Schnittstellen und abstrakten Klassen. Ändern Sie nicht die Funktionalität der Klassen. Verstehen Sie die Rolle von Schnittstellen und abstrakten Klassen.

Versuchen Sie nach dem Refactoring, diese chaotischen Methoden `everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` zu vereinfachen, und schätzen Sie die Vorteile der Polymorphie.

Die erforderliche Klassenhierarchie wird wie folgt dargestellt. Der Kreis I stellt eine Schnittstelle dar, der durchgezogene Kreis C stellt eine Klasse dar, der halbhohle Kreis C stellt eine abstrakte Klasse dar, die grüne gepunktete Linie stellt die Implementierung einer Schnittstelle dar, die grüne durchgezogene Linie stellt das Erben von einer Elternklasse dar.

![ähm](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   Sie können diese Herausforderung auf eine der folgenden Arten meistern:
    -   Empfohlen für Anfänger: Führen Sie `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action` aus, um den Code herunterzuladen, beenden Sie die Herausforderung in Ihrer lokalen IDE und kopieren/fügen Sie dann die Antwort ein/senden Sie sie ein Web-Editor.
        -   Wenn Sie nicht wissen wie, können Sie auf [Projekt in IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md) [importieren / Projekt in VSCode importieren klicken](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Bevor Sie Ihren Code einreichen, sollten Sie `mvn verify` besser lokal ausführen, um Zeit zu sparen. Sie wissen nicht wie? Siehe [Lokal verifizieren in IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md) / [Lokal verifizieren in VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sehr nicht zu empfehlen: Sie können [hier klicken, um den gezippten Code herunterzuladen,](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main) wenn Sie `git` -Operationen nicht mögen.
    -   Oder: Wenn Sie sicher genug sind, Code direkt im Web-Editor zu schreiben, fahren Sie fort.
    -   Oder: Wenn Sie sich mit GitHub auskennen, können Sie [das Repo forken](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action) , die Challenge beenden und einen Pull-Request erstellen.
-   Der Bot überprüft Ihre PR und teilt Ihnen mit, ob Sie die Herausforderung meistern.
-   Gehen Sie zurück zu [ByteLegend](https://bytelegend.com) und setzen Sie Ihre Heldenreise fort.

Viel Glück!

Wenn Sie Hilfe benötigen, können Sie sich gerne der [Discord Community](https://discord.gg/35RreUUGWt) anschließen oder uns über [contact@bytelegend.com kontaktieren](mailto:contact@bytelegend.com) .

**Hinweis: Wir erlauben Ihnen nur, die folgenden Dateien zu ändern. Alle Änderungen an anderen Dateien als den folgenden Dateien werden abgelehnt:**

-   `src/main/java/com/bytelegend/World.java`
</details>

<details>
<summary>한국어</summary>

작동 중인 인터페이스 및 추상 클래스
--------------------

인터페이스 및 추상 클래스를 사용하여 [src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java) 의 `Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly` 클래스를 리팩토링하십시오. 클래스의 기능을 변경하지 마십시오. 인터페이스와 추상 클래스의 역할을 이해합니다.

리팩토링 후 이 지저분한 메소드 `everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` ) 를 단순화하고 다형성의 이점을 높이 평가하십시오.

필요한 클래스 계층은 다음과 같습니다. 원 I은 인터페이스를 나타내고, 실선 원 C는 클래스를 나타내고, 반 중공 원 C는 추상 클래스를 나타내고, 녹색 점선은 인터페이스 구현을 나타내고, 녹색 실선은 부모 클래스에서 상속을 나타냅니다.

![음](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   아래 방법을 통해 이 챌린지를 완료할 수 있습니다.
    -   초보자에게 권장: `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action` 을 실행하여 코드를 다운로드하고 로컬 IDE에서 챌린지를 완료한 다음 복사/붙여넣기/제출 웹 에디터.
        -   방법을 모르는 경우 [프로젝트를 IDEA로](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md) [가져오기 / 프로젝트를 VSCode로 가져](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md) 오기를 클릭할 수 있습니다.
        -   코드를 제출하기 전에 시간을 절약하기 위해 로컬에서 `mvn verify` 를 실행하는 것이 좋습니다. 방법을 모르십니까? [IDEA에서 로컬로](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md) [확인/VSCode에서 로컬로](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md) 확인을 참조하세요.
    -   매우 권장하지 않음: `git` 작업이 마음에 들지 않으면 [여기를 클릭하여 압축 코드를 다운로드](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main) 할 수 있습니다.
    -   또는 웹 편집기에서 직접 코드를 작성할 만큼 자신이 있다면 계속 진행하십시오.
    -   또는 GitHub에 익숙하다면 리포지토리를 분기 [하고](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action) 챌린지를 완료하고 풀 요청을 생성할 수 있습니다.
-   봇은 PR을 확인하고 도전 과제를 달성했는지 알려줍니다.
-   [ByteLegend](https://bytelegend.com) 로 돌아가 영웅 여정을 계속하세요.

행운을 빕니다!

도움이 필요하면 언제든지 [Discord 커뮤니티](https://discord.gg/35RreUUGWt) 에 가입하거나 [contact@bytelegend.com](mailto:contact@bytelegend.com) 을 통해 문의하세요.

**참고: 다음 파일만 수정할 수 있습니다. 다음 파일 이외의 파일에 대한 변경 사항은 거부됩니다.**

-   `src/main/java/com/bytelegend/World.java`
</details>

<details>
<summary>Italiano</summary>

Interfaccia e classe astratta in azione
---------------------------------------

Per favore refactoring delle classi `Car` / `Cat` / `Fish` / `Plane` / `Bird` / `Butterfly` in [src/main/java/com/bytelegend/World.java](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/src/main/java/com/bytelegend/World.java) con interfacce e classi astratte. Non modificare la funzionalità delle classi. Comprendere il ruolo delle interfacce e delle classi astratte.

Dopo il refactoring, prova a semplificare questi metodi disordinati `everyFlyableObjectFly()` / `everySoundMakerMakeSound()` / `everyAnimalBreath()` e apprezza i vantaggi del polimorfismo.

La gerarchia delle classi richiesta è mostrata come segue. Il cerchio I rappresenta un'interfaccia, il cerchio pieno C rappresenta una classe, il cerchio semi-cavo C rappresenta una classe astratta, la linea tratteggiata verde rappresenta l'implementazione di un'interfaccia, la linea continua verde rappresenta l'ereditarietà da una classe genitore.

![uml](https://raw.githubusercontent.com/ByteLegendQuest/java-interface-abstract-class-in-action/main/docs/uml.png)

-   Puoi portare a termine questa sfida in qualsiasi modo di seguito:
    -   Consigliato per i principianti: esegui `git clone https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action` per scaricare il codice, completa la sfida nel tuo IDE locale, quindi copia/incolla/invia la risposta in editore web.
        -   Se non sai come fare, puoi fare clic su [importa progetto in IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import.md) / [importa progetto in VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Prima di inviare il codice, è meglio eseguire `mvn verify` in locale per risparmiare tempo. Non sai come? Vedere [verifica in locale in IDEA](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-idea.md) / [verifica in locale in VSCode](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Molto sconsigliato: puoi fare [clic qui per scaricare il codice zippato](https://codeload.github.com/ByteLegendQuest/java-interface-abstract-class-in-action/zip/refs/heads/main) se non ti piacciono le operazioni `git` .
    -   Oppure: se sei abbastanza sicuro da scrivere il codice direttamente nell'editor web, vai avanti.
    -   Oppure: se hai familiarità con GitHub, puoi eseguire il fork [del repository](https://github.com/ByteLegendQuest/java-interface-abstract-class-in-action) , completare la sfida e creare una richiesta pull.
-   Il bot controllerà il tuo PR e ti dirà se hai superato la sfida.
-   Torna a [ByteLegend](https://bytelegend.com) e continua il tuo viaggio da eroe.

In bocca al lupo!

Se hai bisogno di aiuto, non esitare a unirti alla [community di Discord](https://discord.gg/35RreUUGWt) o contattaci tramite [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: ti permettiamo solo di modificare i seguenti file. Eventuali modifiche ai file diversi dai seguenti file verranno rifiutate:**

-   `src/main/java/com/bytelegend/World.java`
</details>
