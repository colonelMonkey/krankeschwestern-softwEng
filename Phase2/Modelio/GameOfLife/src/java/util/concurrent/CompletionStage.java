package java.util.concurrent;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e715c71e-be64-4085-8451-2b4ca4ffa3cb")
public interface CompletionStage {
    @objid ("19303ed8-5606-4012-a33d-9245424a714d")
    CompletionStage acceptEither(CompletionStage p0, Consumer p1);

    @objid ("ecc8fceb-43ab-4bb7-b28b-9a2835d0f6d0")
    CompletionStage acceptEitherAsync(CompletionStage p0, Consumer p1);

    @objid ("b9e766a4-88c1-4782-b62a-329cb84b58f0")
    CompletionStage acceptEitherAsync(CompletionStage p0, Consumer p1, Executor p2);

    @objid ("e6cd90a5-cee4-4d28-9e3c-093f83cdb75e")
    CompletionStage applyToEither(CompletionStage p0, Function p1);

    @objid ("ab38f3ab-5d2a-422e-9c1c-f93a74730460")
    CompletionStage applyToEitherAsync(CompletionStage p0, Function p1);

    @objid ("faa705b2-f58c-491b-9adb-4375d58106d3")
    CompletionStage applyToEitherAsync(CompletionStage p0, Function p1, Executor p2);

    @objid ("91f0068f-964d-4fab-a3c0-0c3c35542aee")
    CompletionStage exceptionally(Function p0);

    @objid ("08d8dfdb-6fb0-4d78-99f6-0e6943ff7c83")
    CompletionStage handle(BiFunction p0);

    @objid ("274f5117-8ba7-4c72-b77f-19011cb801a2")
    CompletionStage handleAsync(BiFunction p0);

    @objid ("c0810509-564c-4532-a27d-d6d5e378fbcb")
    CompletionStage handleAsync(BiFunction p0, Executor p1);

    @objid ("2c8e3e73-ab9d-4399-8327-fb3f78897039")
    CompletionStage runAfterBoth(CompletionStage p0, Runnable p1);

    @objid ("955c1561-eeb8-44e2-adb8-0b7ae18ffb86")
    CompletionStage runAfterBothAsync(CompletionStage p0, Runnable p1, Executor p2);

    @objid ("1e3b6e63-4102-44d1-beba-026435cf3dc0")
    CompletionStage runAfterBothAsync(CompletionStage p0, Runnable p1);

    @objid ("a0534645-2e57-40f8-b7f0-cfbbc546f55c")
    CompletionStage runAfterEither(CompletionStage p0, Runnable p1);

    @objid ("8c648736-7251-4b0d-9494-8776b107432b")
    CompletionStage runAfterEitherAsync(CompletionStage p0, Runnable p1, Executor p2);

    @objid ("2340797d-d2b9-483a-9ead-f3baa21a2aec")
    CompletionStage runAfterEitherAsync(CompletionStage p0, Runnable p1);

    @objid ("a380ad90-fb7b-4bde-9aed-fbe19636ebcd")
    CompletionStage thenAccept(Consumer p0);

    @objid ("2a5beab6-04a0-4e2a-bbff-1274ee02e106")
    CompletionStage thenAcceptAsync(Consumer p0, Executor p1);

    @objid ("98cd9730-d469-463b-8f51-7eefdfc58ce6")
    CompletionStage thenAcceptAsync(Consumer p0);

    @objid ("1b42ae4d-1c44-46e1-a230-fb915967825a")
    CompletionStage thenAcceptBoth(CompletionStage p0, BiConsumer p1);

    @objid ("172a7cde-2a5d-44d8-ad94-9dce96d8208e")
    CompletionStage thenAcceptBothAsync(CompletionStage p0, BiConsumer p1, Executor p2);

    @objid ("f17990e3-45ef-4dbf-810b-b8b052721bff")
    CompletionStage thenAcceptBothAsync(CompletionStage p0, BiConsumer p1);

    @objid ("9af405c3-8285-44cb-b9fc-5145df5dc0c1")
    CompletionStage thenApply(Function p0);

    @objid ("adee20b8-e551-498d-b8d7-245796fc465f")
    CompletionStage thenApplyAsync(Function p0);

    @objid ("24854c07-ae9b-42bc-9228-bae458e6d3f6")
    CompletionStage thenApplyAsync(Function p0, Executor p1);

    @objid ("709fff52-6ec8-407b-ae39-816971eb5be0")
    CompletionStage thenCombine(CompletionStage p0, BiFunction p1);

    @objid ("f734d02e-4340-4d7d-bd4a-b7087e6f2d14")
    CompletionStage thenCombineAsync(CompletionStage p0, BiFunction p1, Executor p2);

    @objid ("277d57eb-7154-4c9c-b4ba-0123263c473d")
    CompletionStage thenCombineAsync(CompletionStage p0, BiFunction p1);

    @objid ("d9b242b8-32b8-49c2-84e4-9361bbd08a96")
    CompletionStage thenCompose(Function p0);

    @objid ("cf1b3357-5717-4151-a85e-855dc6345ebf")
    CompletionStage thenComposeAsync(Function p0, Executor p1);

    @objid ("6469493c-b15b-4d67-9820-2d381bc54e7c")
    CompletionStage thenComposeAsync(Function p0);

    @objid ("41d43ef9-49c6-4fa2-8ffa-36b6112fda8f")
    CompletionStage thenRun(Runnable p0);

    @objid ("aa07a6ab-118c-41a8-86f8-628e5a6f6956")
    CompletionStage thenRunAsync(Runnable p0);

    @objid ("e68560c3-6662-49f2-bd75-fffa2c7568d7")
    CompletionStage thenRunAsync(Runnable p0, Executor p1);

    @objid ("c1ad31e2-c574-4c1a-b08c-cf65ddb94530")
    CompletableFuture toCompletableFuture();

    @objid ("6a904b1f-e142-4904-be0d-71c9ff8fcd05")
    CompletionStage whenComplete(BiConsumer p0);

    @objid ("8121a5fe-d65b-4bef-a38b-76d15ca8a67d")
    CompletionStage whenCompleteAsync(BiConsumer p0, Executor p1);

    @objid ("1e02a7cf-05fe-4f27-9425-ff41b9dc4043")
    CompletionStage whenCompleteAsync(BiConsumer p0);

}
