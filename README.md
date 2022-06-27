## Introduction

Element is an embedded language for XML. It uses Java's generic type system to enforce, at compile-time (and edit-time if you are using an IDE), the following schema semantics:

  * Attributes have defined types that the values must conform to.
  * Only the correct child node types can be created inside a parent.

Element does *not* enforce:

  * Mandatory attributes.
  * Mandatory child elements.
  * Child element ordering constraints.


### Details

Element comes with a pre-defined example schema (XHTML).
Here's an example of code using this schema:

        PrintElement.begin(html)
            ._(body)
                ._(div)._(CLASS, "intro")
                    ._(h1, "Copalis Element")
                    ._(p)
                        ._(a)._(HREF, new URI("http://code.google.com/p/copalis/w/edit/copalisElement"))
                            .$("Element")
                        ._()
                        .$("is an API for programmatically generating HTML or XML.")
                    ._()
                    ._(p)
                        .$("Element uses Java's generic type system to enforce, at compile-time")
                        .$("(and edit-time if you are using Eclipse),")
                        .$("the following schema semantics:")
                    ._()
                    ._(ul)
                        ._(li, "Attributes have defined types that the values must conform to.")
                        ._(li, "Only the correct child node types can be created inside a parent.")
                    ._()
                    ._(p).$("Element does ")._(em, "not").$("enforce:")._()
                    ._(ul)
                        ._(li, "Mandatory attributes.")
                        ._(li, "Mandatory child elements.")
                        ._(li, "Child element ordering constraints.")
                    ._()
                    ._(p, "Element defines 5 fundamental methods:")
                    ._(table)._(BORDER, 0)
                        ._(tr)._(th, "Name")._(th, "Usage")._(th, "Output")._()
                        ._(tr)._(td, "_")._(td, "_(div)")._(td, "<div>")._()
                        ._(tr)._(td, "_")._(td, "_(ID, \"nodeid\")")._(td, "id=\"nodeid\"")._()
                        ._(tr)._(td, "_")._(td, "_(p, \"Some text\")")._(td, "<p>Some text</p>")._()
                        ._(tr)._(td, "_")._(td, "_()")._(td, "</div>")._()
                        ._(tr)._(td, "$")._(td, "$(\"Some text\")")._(td, "Some text")._()
                    ._()
                ._()
            ._()
        ._();
