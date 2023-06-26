declare module "*.vue" {
  import { defineComponent } from "vue";
  const Component: ReturnType<typeof defineComponent>;
  export default Component;
}
// shims-html.d.ts 파일은 html파일을 템플릿 형태로 인식하도록 도와준다.