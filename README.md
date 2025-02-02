# bleepjslink

A small demo to see bleep javascript link work in isolation

`bleep link` does not produce the main.js I expected:

```bash
wser
│   ├── Browser-js
│   ├── bloop-internal-classes
│   │   └── classes-jj21iypXTjeJXxj0BrxM4Q==
│   │       └── net
│   │           └── walend
│   │               └── link
│   │                   ├── Main$.class
│   │                   ├── Main$.sjsir
│   │                   ├── Main.class
│   │                   ├── Main.sjsir
│   │                   └── Main.tasty
│   ├── classes
│   │   └── net
│   │       └── walend
│   │           └── link
│   │               ├── Main$.class
│   │               ├── Main$.sjsir
│   │               ├── Main.class
│   │               ├── Main.sjsir
│   │               └── Main.tasty
│   └── inc_compile.zip
├── Browser.json
└── bloop-digest

12 directories, 13 files
```

`bleep run` produces the main.js, then attepts to run it:

```bash
:
📕 BSP: ReferenceError: document is not defined
📕 BSP:     at $c_Lnet_walend_link_Main$.main__AT__V (/Users/dwalend/projects/bleepjslink/.bleep/builds/normal/.bloop/Browser/Browser-js/main.js:993:17)
📕 BSP:     at $s_Lnet_walend_link_Main__main__AT__V (/Users/dwalend/projects/bleepjslink/.bleep/builds/normal/.bloop/Browser/Browser-js/main.js:978:31)
📕 BSP:     at Object.<anonymous> (/Users/dwalend/projects/bleepjslink/.bleep/builds/normal/.bloop/Browser/Browser-js/main.js:1980:1)
📕 BSP:     at Object.<anonymous> (/Users/dwalend/projects/bleepjslink/.bleep/builds/normal/.bloop/Browser/Browser-js/main.js:1981:4)
📕 BSP:     at Module._compile (node:internal/modules/cjs/loader:1368:14)
📕 BSP:     at Module._extensions..js (node:internal/modules/cjs/loader:1426:10)
📕 BSP:     at Module.load (node:internal/modules/cjs/loader:1205:32)
📕 BSP:     at Module._load (node:internal/modules/cjs/loader:1021:12)
📕 BSP:     at Function.executeUserEntryPoint [as runMain] (node:internal/modules/run_main:142:12)
📕 BSP:     at node:internal/main/run_main_module:28:49
📕 BSP:
📕 BSP: Node.js v21.7.2
📕 command failed: Run Browser failed status code ERROR
✘-1 ~/projects/bleepjslink [main|…21]
10:36 $ tree /Users/dwalend/projects/bleepjslink/.bleep/builds/normal/.bloop
/Users/dwalend/projects/bleepjslink/.bleep/builds/normal/.bloop
├── Browser
│   ├── Browser-js
│   │   └── main.js
│   ├── bloop-internal-classes
│   │   └── classes-dQV4lQlBR3inJME9tCenfg==
│   │       └── net
│   │           └── walend
│   │               └── link
│   │                   ├── Main$.class
│   │                   ├── Main$.sjsir
│   │                   ├── Main.class
│   │                   ├── Main.sjsir
│   │                   └── Main.tasty
│   ├── classes
│   │   └── net
│   │       └── walend
│   │           └── link
│   │               ├── Main$.class
│   │               ├── Main$.sjsir
│   │               ├── Main.class
│   │               ├── Main.sjsir
│   │               └── Main.tasty
│   └── inc_compile.zip
├── Browser.json
└── bloop-digest

12 directories, 14 files~
```

I need something that produces the `main.js` file, but does not attept to run it outside the browser. I expected `bleep link` to do that.
