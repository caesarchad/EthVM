<template>
  <div>
    <v-btn block outline large slot="activator" color="secondary" class="text-capitalize pl-1 pr-1" small @click.native.stop="dialog = true">
      <v-layout row justify-start align-center>
        <v-flex xs2>
          <p class="body-2 mb-0 font-weight-regular">{{ $t('filter.name') }}:</p>
        </v-flex>
        <v-spacer />
        <v-flex>
          <p class="body-2 mb-0 font-weight-regular text-xs-right">{{ items[selected].filter }} ({{ items[selected].category }} )</p>
        </v-flex>
        <v-flex xs1 pr-4>
          <v-icon class="secondary--text fas fa-chevron-right" small />
        </v-flex>
      </v-layout>
    </v-btn>
    <v-dialog v-model="dialog" full-width>
      <v-card>
        <v-layout row class="pl-3 pr-3 pt-3">
          <v-flex>
            <v-card-title class="title font-weight-bold ">{{ $t('filter.name') }}</v-card-title>
          </v-flex>
          <v-spacer />
          <v-flex xs1 mr-3>
            <v-btn icon @click="dialog = false">
              <v-icon class="info--text fas fa-times " />
            </v-btn>
          </v-flex>
        </v-layout>
        <v-divider class="lineGrey"></v-divider>
        <v-list class="pb-3">
          <v-list-tile v-for="(item, index) in items" :key="index" class="pl-0" @click="setSelected(index)">
            <v-layout row justify-start align-center fill-height>
              <v-flex xs5>
                <v-card-title :class="[selected === index ? 'black--text' : 'info--text']">{{ item.category }}:</v-card-title>
              </v-flex>
              <v-flex xs7>
                <v-layout row justify-start align-center>
                  <v-card-title :class="[selected === index ? 'black--text' : 'info--text']">{{ item.filter }}</v-card-title>
                  <v-icon v-if="index === selected" class="txSuccess--text fa fa-check-circle" />
                </v-layout>
              </v-flex>
            </v-layout>
          </v-list-tile>
        </v-list>
      </v-card>
    </v-dialog>
  </div>
</template>

<script lang="ts">
import { Vue, Component, Prop, Watch } from 'vue-property-decorator'

@Component
export default class TokenFilter extends Vue {
  /*
  ===================================================================================
    Initial Data
  ===================================================================================
  */

  selected = 0
  dialog = false

  get items() {
    return [
      {
        _id: 0,
        category: this.$i18n.tc('price.name', 1),
        filter: this.$i18n.t('filter.high')
      },
      {
        _id: 1,
        category: this.$i18n.tc('price.name', 1),
        filter: this.$i18n.t('filter.low')
      },
      {
        _id: 4,
        category: this.$i18n.t('token.market'),
        filter: this.$i18n.t('filter.high')
      },
      {
        _id: 5,
        category: this.$i18n.t('token.market'),
        filter: this.$i18n.t('filter.low')
      }
    ]
  }

  /*
  ===================================================================================
    Methods
  ===================================================================================
  */

  setSelected(_index: number) {
    this.selected = _index
    this.dialog = false
  }

  selectedClass(_index: number) {
    return this.selected === _index ? 'info--text' : 'black--text'
  }

  /*
  ===================================================================================
    Watchers
  ===================================================================================
  */

  @Watch('selected')
  onPageChanged(newVal: number, oldVal: number): void {
    this.$emit('filterMobile', this.items[newVal]._id)
  }
}
</script>
