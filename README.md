<p>
  <a href="https://github.com/hnggngn/solid-snippets">
    <img width="100%" src="https://assets.solidjs.com/banner?type=Snippets&background=tiles&project=%20" alt="Solid Snippets">
  </a>
</p>

# Solid Snippets

A helpful snippets for Solid.js with Typescript.

## Available Snippets

### Component

<table>
<thead>
<th>Shortcut</th>
<th>Description</th>
<th>Snippets</th>
</thead>
<tbody>
<tr>
<td>

`sfcompie`
</td>
<td>Solid empty function component with import and default export</td>
<td>

```tsx
import {Component} from "solid-js";

const $1$: Component<{ $2$ }> = props => {
    return (
        <div>$END$</div>
    );
};

export default $1$;
```

</td>
</tr>
<tr>
<td>

`sfcompien`
</td>
<td>Solid empty function component with import and named export</td>
<td>

```tsx
import {Component} from "solid-js";

export const $1$: Component<{ $2$ }> = props => {
    return (
        <div>$END$</div>
    );
};
```

</td>
</tr>
<tr>
<td>

`sffcompie`
</td>
<td>Solid empty Flow Component with import and default export</td>
<td>

```tsx
import {FlowComponent, JSX} from "solid-js";

const $1$: FlowComponent<{ $2$, JSX.Element }> = props => {
    return (
        <div>{props.children}</div>
    );
};

export default $1$;
```

</td>
</tr>
<tr>
<td>

`sffcompien`
</td>
<td>Solid empty Flow Component with import and named export</td>
<td>

```tsx
import {FlowComponent, JSX} from "solid-js";

export const $1$: FlowComponent<{ $2$, JSX.Element }> = props => {
    return (
        <div>{props.children}</div>
    );
};
```

</td>
</tr>
<tr>
<td>

`spfcompie`
</td>
<td>Solid empty Parent Component with import and default export</td>
<td>

```tsx
import {ParentComponent} from "solid-js";

const $1$: ParentComponent<{ $2$ }> = props => {
    return (
        <div>{props.children}</div>
    );
};

export default $1$;
```

</td>
</tr>
<tr>
<td>

`spfcompien`
</td>
<td>Solid empty Parent Component with import and named export</td>
<td>

```tsx
import {ParentComponent} from "solid-js";

export const $1$: ParentComponent<{ $2$ }> = props => {
    return (
        <div>{props.children}</div>
    );
};
```

</td>
</tr>
<tr>
<td>

`svfcompie`
</td>
<td>Solid empty Void Component with import and default export</td>
<td>

```tsx
import {VoidComponent} from "solid-js";

const $1$: VoidComponent<{ $2$ }> = props => {
    return (
        <div>$END$</div>
    );
};

export default $1$;
```

</td>
</tr>
</tbody>
</table>

### Reactivity

<table>
<thead>
<th>Shortcut</th>
<th>Description</th>
<th>Snippets</th>
</thead>
<tbody>
<tr>
<td>

`sceff`
</td>
<td>createEffect</td>
<td>

```tsx
createEffect(() => {
    $END$
});
```

</td>
</tr>
<tr>
<td>

`scmemo`
</td>
<td>createMemo</td>
<td>

```tsx
const $VAR$ = createMemo(() => $DEFAULT_VAL$);
```

</td>
</tr>
<tr>
<td>

`scres`
</td>
<td>createResource</td>
<td>

```tsx
const [data, {mutate, refetch}] = createResource($DEFAULT_VAL$);
$END$
```

</td>
</tr>
<tr>
<td>

`scsig`
</td>
<td>createSignal</td>
<td>

```tsx
const [$VAR$, set$VAR_SET$] = createSignal($DEFAULT_VAL$);
$END$
```

</td>
</tr>
</tbody>
</table>

### Store

<table>
<thead>
<th>Shortcut</th>
<th>Description</th>
<th>Snippets</th>
</thead>
<tbody>
<tr>
<td>

`scstore`
</td>
<td>createStore</td>
<td>

```tsx
const [$VAR$, set$VAR_SET$] = createStore($DEFAULT_VAL$);
$END$
```

</td>
</tr>
</tbody>
</table>

### Lifecycles

<table>
<thead>
<th>Shortcut</th>
<th>Description</th>
<th>Snippets</th>
</thead>
<tbody>
<tr>
<td>

`sonm`
</td>
<td>onMount</td>
<td>

```tsx
onMount(() => {
    $END$
});
```

</td>
</tr>
<tr>
<td>

`sone`
</td>
<td>onError</td>
<td>

```tsx
onError(() => {
    $END$
});
```

</td>
</tr>
<tr>
<td>

`sonc`
</td>
<td>onCleanup</td>
<td>

```tsx
onCleanup(() => {
    $END$
});
```

</td>
</tr>
</tbody>
</table>

### Control Flow

<table>
<thead>
<th>Shortcut</th>
<th>Description</th>
<th>Snippets</th>
</thead>
<tbody>
<tr>
<td>

`sfor`
</td>
<td>For control flow</td>
<td>

```tsx
<For each={$1$} fallback={<div>Loading...</div>}>
    {(item) => <div>{item}</div>}
</For>
```

</td>
</tr>
<tr>
<td>

`sshow`
</td>
<td>Show control flow</td>
<td>

```tsx
<Show when={$1$} fallback={<div>Loading...</div>}>
    <div>$2$</div>
</Show>
```

</td>
</tr>
<tr>
<td>

`sswitch`
</td>
<td>Switch control flow</td>
<td>

```tsx
<Switch fallback={<div>Not Found</div>}>
    <Match when={$1$}>
        <div>$END$</div>
    </Match>
</Switch>
```

</td>
</tr>
</tbody>
</table>
