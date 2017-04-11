new hobs.TestSuite("[AEM Samples] Shared Menu Tests", {path:"/apps/samples-shared-menul/tests/SampleTests.js", register: true})

    .addTestCase(new hobs.TestCase("Hello World component on english page")
        .navigateTo("/content/samples-shared-menu/en.html")
        .asserts.location("/content/samples-shared-menu/en.html", true)
        .asserts.visible(".helloworld", true)
    )

    .addTestCase(new hobs.TestCase("Hello World component on french page")
        .navigateTo("/content/samples-shared-menu/fr.html")
        .asserts.location("/content/samples-shared-menu/fr.html", true)
        .asserts.visible(".helloworld", true)
    );
