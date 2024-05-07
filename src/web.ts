import { WebPlugin } from '@capacitor/core';

import type { ExamplePlugin, RequestProxyProps } from './definitions';

export class ExampleWeb extends WebPlugin implements ExamplePlugin {
  async sendLoginBroadcast() {}
  async sendLogOutBroadcast() {}
  async getRecord() {}
  async requestProxy(props: RequestProxyProps) {}
}
